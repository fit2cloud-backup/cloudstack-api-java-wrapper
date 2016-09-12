package com.fit2cloud.cloudstack.wsclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SignatureException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

import com.fit2cloud.cloudstack.wsclient.domain.model.CloudStackAction;
import com.fit2cloud.cloudstack.wsclient.model.request.Request;
import com.fit2cloud.cloudstack.wsclient.model.request.affinitygroups.ListAffinityGroupsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.asyncjob.QueryAsyncJobResultRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.configuration.ListCapabilitiesRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.diskoffering.ListDiskOfferingsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.host.ListHostsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.hypervisor.ListHypervisorsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.imagestore.ListImageStoresRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.iso.ListIsosRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.network.ListNetworksRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.networkoffering.ListNetworkOfferingsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.region.ListRegionsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.serviceoffering.ListServiceOfferingsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.storagepools.ListStoragePoolsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.systemcapacity.ListCapacityRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.template.CreateTemplateRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.template.DeleteTemplateRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.template.ListTemplatesRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine.DeployVirtualMachineRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine.DestroyVirtualMachineRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine.ListVirtualMachinesRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine.RebootVirtualMachineRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine.StartVirtualMachineRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine.StopVirtualMachineRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.volume.ListVolumesRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.vpc.ListVPCsRequest;
import com.fit2cloud.cloudstack.wsclient.model.request.zone.ListZonesRequest;
import com.fit2cloud.cloudstack.wsclient.model.response.affinitygroups.ListAffinityGroupsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.asyncjob.QueryAsyncJobResultResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.asyncjob.QueryAsyncJobResultResponseDetail;
import com.fit2cloud.cloudstack.wsclient.model.response.configuration.ListCapabilitiesResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.diskoffering.ListDiskOfferingsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.host.ListHostsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.hypervisor.ListHypervisorsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.imagestore.ListImageStoresResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.iso.ListIsosResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.network.ListNetworksResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.networkoffering.ListNetworkOfferingsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.region.ListRegionsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.serviceoffering.ListServiceOfferingsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.storagepools.ListStoragePoolsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.systemcapacity.ListCapacityResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.template.CreateTemplateResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.template.DeleteTemplateResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.template.ListTemplatesResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.DeployVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.DestroyVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.ListVirtualMachinesResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.RebootVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.StartVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.StopVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.volume.ListVolumesResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.vpc.ListVPCsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.zone.ListZonesResponse;
import com.google.gson.Gson;


public class CloudStackWSClient implements ICloudStackWSClient {
	private static final String ENCODING = "UTF-8";
	private static final boolean DEBUG = false;
	
	private String endpoint = null;

	private String apiKey;
	private String secretKey;

	public CloudStackWSClient(String apiKey, String secretKey, String endPoint) {
		this.apiKey = apiKey;
		this.secretKey = secretKey;
		if(endPoint != null && endPoint.trim().length() > 0) {
			this.endpoint = endPoint.trim();
			if(!this.endpoint.endsWith("/")) {
				this.endpoint += "/";
			}
		}
	}
		
	public DeployVirtualMachineResponse deployVirtualMachine(DeployVirtualMachineRequest deployVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.DEPLOY_VIRTUAL_MACHINE, deployVirtualMachineRequest, DeployVirtualMachineResponse.class);
	}

	public DestroyVirtualMachineResponse destroyVirtualMachine(DestroyVirtualMachineRequest destroyVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.DESTROY_VIRTUAL_MACHINE, destroyVirtualMachineRequest, DestroyVirtualMachineResponse.class);
	}

	public RebootVirtualMachineResponse rebootVirtualMachine(RebootVirtualMachineRequest rebootVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.REBOOT_VIRTUAL_MACHINE, rebootVirtualMachineRequest, RebootVirtualMachineResponse.class);
	}

	public StartVirtualMachineResponse startVirtualMachine(StartVirtualMachineRequest startVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.START_VIRTUAL_MACHINE, startVirtualMachineRequest, StartVirtualMachineResponse.class);
	}

	public StopVirtualMachineResponse stopVirtualMachine(StopVirtualMachineRequest stopVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.STOP_VIRTUAL_MACHINE, stopVirtualMachineRequest, StopVirtualMachineResponse.class);
	}

//	public ResetPasswordForVirtualMachineResponse resetPasswordForVirtualMachine(ResetPasswordForVirtualMachineRequest resetPasswordForVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.RESET_PASSWORD_FOR_VIRTUAL_MACHINE, resetPasswordForVirtualMachineRequest, ResetPasswordForVirtualMachineResponse.class);
//	}

//	public UpdateVirtualMachineResponse updateVirtualMachine(UpdateVirtualMachineRequest updateVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.UPDATE_VIRTUAL_MACHINE, updateVirtualMachineRequest, UpdateVirtualMachineResponse.class);
//	}

	public ListVirtualMachinesResponse listVirtualMachines(ListVirtualMachinesRequest listVirtualMachinesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_VIRTUAL_MACHINES, listVirtualMachinesRequest, ListVirtualMachinesResponse.class);
	}

//	public GetVMPasswordResponse getVMPassword(GetVMPasswordRequest getVMPasswordRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.GET_VM_PASSWORD, getVMPasswordRequest, GetVMPasswordResponse.class);
//	}

//	public RestoreVirtualMachineResponse restoreVirtualMachine(RestoreVirtualMachineRequest restoreVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.RESTORE_VIRTUAL_MACHINE, restoreVirtualMachineRequest, RestoreVirtualMachineResponse.class);
//	}

//	public ChangeServiceForVirtualMachineResponse changeServiceForVirtualMachine(ChangeServiceForVirtualMachineRequest changeServiceForVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.CHANGE_SERVICE_FOR_VIRTUAL_MACHINE, changeServiceForVirtualMachineRequest, ChangeServiceForVirtualMachineResponse.class);
//	}

//	public ScaleVirtualMachineResponse scaleVirtualMachine(ScaleVirtualMachineRequest scaleVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.SCALE_VIRTUAL_MACHINE, scaleVirtualMachineRequest, ScaleVirtualMachineResponse.class);
//	}

//	public AddNicToVirtualMachineResponse addNicToVirtualMachine(AddNicToVirtualMachineRequest addNicToVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.ADD_NIC_TO_VIRTUAL_MACHINE, addNicToVirtualMachineRequest, AddNicToVirtualMachineResponse.class);
//	}

//	public RemoveNicFromVirtualMachineResponse removeNicFromVirtualMachine(RemoveNicFromVirtualMachineRequest removeNicFromVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.REMOVE_NIC_FROM_VIRTUAL_MACHINE, removeNicFromVirtualMachineRequest, RemoveNicFromVirtualMachineResponse.class);
//	}

//	public UpdateDefaultNicForVirtualMachineResponse updateDefaultNicForVirtualMachine(UpdateDefaultNicForVirtualMachineRequest updateDefaultNicForVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.UPDATE_DEFAULT_NIC_FOR_VIRTUAL_MACHINE, updateDefaultNicForVirtualMachineRequest, UpdateDefaultNicForVirtualMachineResponse.class);
//	}

	public ListVPCsResponse listVPCs(ListVPCsRequest listVPCsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_VP_CS, listVPCsRequest, ListVPCsResponse.class);
	}

//	public UpdateVPCResponse updateVPC(UpdateVPCRequest updateVPCRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.UPDATE_VPC, updateVPCRequest, UpdateVPCResponse.class);
//	}

//	public ListVPCOfferingsResponse listVPCOfferings(ListVPCOfferingsRequest listVPCOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_VPC_OFFERINGS, listVPCOfferingsRequest, ListVPCOfferingsResponse.class);
//	}

//	public ListPrivateGatewaysResponse listPrivateGateways(ListPrivateGatewaysRequest listPrivateGatewaysRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_PRIVATE_GATEWAYS, listPrivateGatewaysRequest, ListPrivateGatewaysResponse.class);
//	}

//	public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest createSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.CREATE_SNAPSHOT, createSnapshotRequest, CreateSnapshotResponse.class);
//	}

//	public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest listSnapshotsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_SNAPSHOTS, listSnapshotsRequest, ListSnapshotsResponse.class);
//	}
//
//	public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DELETE_SNAPSHOT, deleteSnapshotRequest, DeleteSnapshotResponse.class);
//	}
//
//	public CreateSnapshotPolicyResponse createSnapshotPolicy(CreateSnapshotPolicyRequest createSnapshotPolicyRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.CREATE_SNAPSHOT_POLICY, createSnapshotPolicyRequest, CreateSnapshotPolicyResponse.class);
//	}
//
//	public DeleteSnapshotPoliciesResponse deleteSnapshotPolicies(DeleteSnapshotPoliciesRequest deleteSnapshotPoliciesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DELETE_SNAPSHOT_POLICIES, deleteSnapshotPoliciesRequest, DeleteSnapshotPoliciesResponse.class);
//	}
//
//	public ListSnapshotPoliciesResponse listSnapshotPolicies(ListSnapshotPoliciesRequest listSnapshotPoliciesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_SNAPSHOT_POLICIES, listSnapshotPoliciesRequest, ListSnapshotPoliciesResponse.class);
//	}
//
//	public ListVMSnapshotResponse listVMSnapshot(ListVMSnapshotRequest listVMSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_VM_SNAPSHOT, listVMSnapshotRequest, ListVMSnapshotResponse.class);
//	}
//
//	public CreateVMSnapshotResponse createVMSnapshot(CreateVMSnapshotRequest createVMSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.CREATE_VM_SNAPSHOT, createVMSnapshotRequest, CreateVMSnapshotResponse.class);
//	}
//
//	public DeleteVMSnapshotResponse deleteVMSnapshot(DeleteVMSnapshotRequest deleteVMSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DELETE_VM_SNAPSHOT, deleteVMSnapshotRequest, DeleteVMSnapshotResponse.class);
//	}
//
//	public AttachVolumeResponse attachVolume(AttachVolumeRequest attachVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.ATTACH_VOLUME, attachVolumeRequest, AttachVolumeResponse.class);
//	}
//
//	public UploadVolumeResponse uploadVolume(UploadVolumeRequest uploadVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.UPLOAD_VOLUME, uploadVolumeRequest, UploadVolumeResponse.class);
//	}
//
//	public DetachVolumeResponse detachVolume(DetachVolumeRequest detachVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DETACH_VOLUME, detachVolumeRequest, DetachVolumeResponse.class);
//	}
//
//	public CreateVolumeResponse createVolume(CreateVolumeRequest createVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.CREATE_VOLUME, createVolumeRequest, CreateVolumeResponse.class);
//	}
//
//	public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest deleteVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DELETE_VOLUME, deleteVolumeRequest, DeleteVolumeResponse.class);
//	}

	public ListVolumesResponse listVolumes(ListVolumesRequest listVolumesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_VOLUMES, listVolumesRequest, ListVolumesResponse.class);
	}

//	public ExtractVolumeResponse extractVolume(ExtractVolumeRequest extractVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.EXTRACT_VOLUME, extractVolumeRequest, ExtractVolumeResponse.class);
//	}
//
//	public MigrateVolumeResponse migrateVolume(MigrateVolumeRequest migrateVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.MIGRATE_VOLUME, migrateVolumeRequest, MigrateVolumeResponse.class);
//	}
//
//	public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest resizeVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.RESIZE_VOLUME, resizeVolumeRequest, ResizeVolumeResponse.class);
//	}

	public CreateTemplateResponse createTemplate(CreateTemplateRequest createTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.CREATE_TEMPLATE, createTemplateRequest, CreateTemplateResponse.class);
	}

//	public RegisterTemplateResponse registerTemplate(RegisterTemplateRequest registerTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.REGISTER_TEMPLATE, registerTemplateRequest, RegisterTemplateResponse.class);
//	}
//
//	public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest updateTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.UPDATE_TEMPLATE, updateTemplateRequest, UpdateTemplateResponse.class);
//	}
//
//	public CopyTemplateResponse copyTemplate(CopyTemplateRequest copyTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.COPY_TEMPLATE, copyTemplateRequest, CopyTemplateResponse.class);
//	}

	public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest deleteTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.DELETE_TEMPLATE, deleteTemplateRequest, DeleteTemplateResponse.class);
	}

	public ListTemplatesResponse listTemplates(ListTemplatesRequest listTemplatesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_TEMPLATES, listTemplatesRequest, ListTemplatesResponse.class);
	}

//	public UpdateTemplatePermissionsResponse updateTemplatePermissions(UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.UPDATE_TEMPLATE_PERMISSIONS, updateTemplatePermissionsRequest, UpdateTemplatePermissionsResponse.class);
//	}
//
//	public ListTemplatePermissionsResponse listTemplatePermissions(ListTemplatePermissionsRequest listTemplatePermissionsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_TEMPLATE_PERMISSIONS, listTemplatePermissionsRequest, ListTemplatePermissionsResponse.class);
//	}
//
//	public ExtractTemplateResponse extractTemplate(ExtractTemplateRequest extractTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.EXTRACT_TEMPLATE, extractTemplateRequest, ExtractTemplateResponse.class);
//	}
//
//	public RegisterSSHKeyPairResponse registerSSHKeyPair(RegisterSSHKeyPairRequest registerSSHKeyPairRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.REGISTER_SSH_KEY_PAIR, registerSSHKeyPairRequest, RegisterSSHKeyPairResponse.class);
//	}
//
//	public CreateSSHKeyPairResponse createSSHKeyPair(CreateSSHKeyPairRequest createSSHKeyPairRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.CREATE_SSH_KEY_PAIR, createSSHKeyPairRequest, CreateSSHKeyPairResponse.class);
//	}
//
//	public DeleteSSHKeyPairResponse deleteSSHKeyPair(DeleteSSHKeyPairRequest deleteSSHKeyPairRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DELETE_SSH_KEY_PAIR, deleteSSHKeyPairRequest, DeleteSSHKeyPairResponse.class);
//	}
//
//	public ListSSHKeyPairsResponse listSSHKeyPairs(ListSSHKeyPairsRequest listSSHKeyPairsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_SSH_KEY_PAIRS, listSSHKeyPairsRequest, ListSSHKeyPairsResponse.class);
//	}

	public ListNetworksResponse listNetworks(ListNetworksRequest listNetworksRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_NETWORKS, listNetworksRequest, ListNetworksResponse.class);
	}

//	public ListAccountsResponse listAccounts(ListAccountsRequest listAccountsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_ACCOUNTS, listAccountsRequest, ListAccountsResponse.class);
//	}
//
//	public AddAccountToProjectResponse addAccountToProject(AddAccountToProjectRequest addAccountToProjectRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.ADD_ACCOUNT_TO_PROJECT, addAccountToProjectRequest, AddAccountToProjectResponse.class);
//	}
//
//	public DeleteAccountFromProjectResponse deleteAccountFromProject(DeleteAccountFromProjectRequest deleteAccountFromProjectRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DELETE_ACCOUNT_FROM_PROJECT, deleteAccountFromProjectRequest, DeleteAccountFromProjectResponse.class);
//	}
//
//	public ListProjectAccountsResponse listProjectAccounts(ListProjectAccountsRequest listProjectAccountsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_PROJECT_ACCOUNTS, listProjectAccountsRequest, ListProjectAccountsResponse.class);
//	}
//
//	public CreateTagsResponse createTags(CreateTagsRequest createTagsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.CREATE_TAGS, createTagsRequest, CreateTagsResponse.class);
//	}
//
//	public DeleteTagsResponse deleteTags(DeleteTagsRequest deleteTagsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DELETE_TAGS, deleteTagsRequest, DeleteTagsResponse.class);
//	}
//
//	public ListTagsResponse listTags(ListTagsRequest listTagsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_TAGS, listTagsRequest, ListTagsResponse.class);
//	}
//
//	public AssociateIpAddressResponse associateIpAddress(AssociateIpAddressRequest associateIpAddressRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.ASSOCIATE_IP_ADDRESS, associateIpAddressRequest, AssociateIpAddressResponse.class);
//	}
//
//	public DisassociateIpAddressResponse disassociateIpAddress(DisassociateIpAddressRequest disassociateIpAddressRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.DISASSOCIATE_IP_ADDRESS, disassociateIpAddressRequest, DisassociateIpAddressResponse.class);
//	}
//
//	public ListPublicIpAddressesResponse listPublicIpAddresses(ListPublicIpAddressesRequest listPublicIpAddressesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_PUBLIC_IP_ADDRESSES, listPublicIpAddressesRequest, ListPublicIpAddressesResponse.class);
//	}
//
//	public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.UPDATE_USER, updateUserRequest, UpdateUserResponse.class);
//	}
//
//	public RegisterUserKeysResponse registerUserKeys(RegisterUserKeysRequest registerUserKeysRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.REGISTER_USER_KEYS, registerUserKeysRequest, RegisterUserKeysResponse.class);
//	}
//
//	public ListResourceLimitsResponse listResourceLimits(ListResourceLimitsRequest listResourceLimitsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_RESOURCE_LIMITS, listResourceLimitsRequest, ListResourceLimitsResponse.class);
//	}
//
//	public GetApiLimitResponse getApiLimit(GetApiLimitRequest getApiLimitRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.GET_API_LIMIT, getApiLimitRequest, GetApiLimitResponse.class);
//	}
//
//	public ListOsTypesResponse listOsTypes(ListOsTypesRequest listOsTypesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_OS_TYPES, listOsTypesRequest, ListOsTypesResponse.class);
//	}
//
//	public ListOsCategoriesResponse listOsCategories(ListOsCategoriesRequest listOsCategoriesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_OS_CATEGORIES, listOsCategoriesRequest, ListOsCategoriesResponse.class);
//	}

	public QueryAsyncJobResultResponse queryAsyncJobResult(QueryAsyncJobResultRequest queryAsyncJobResultRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest4AsyncJob("GET", CloudStackAction.QUERY_ASYNC_JOB_RESULT, queryAsyncJobResultRequest);
	}

//	public ListAsyncJobsResponse listAsyncJobs(ListAsyncJobsRequest listAsyncJobsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
//		return doRequest("GET", CloudStackAction.LIST_ASYNC_JOBS, listAsyncJobsRequest, ListAsyncJobsResponse.class);
//	}

	public ListZonesResponse listZones(ListZonesRequest listZonesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_ZONES, listZonesRequest, ListZonesResponse.class);
	}

	public ListServiceOfferingsResponse listServiceOfferings(ListServiceOfferingsRequest listServiceOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_SERVICE_OFFERINGS, listServiceOfferingsRequest, ListServiceOfferingsResponse.class);
	}

	public ListRegionsResponse listRegions(ListRegionsRequest listRegionsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_REGIONS, listRegionsRequest, ListRegionsResponse.class);
	}

	public ListNetworkOfferingsResponse listNetworkOfferings(ListNetworkOfferingsRequest listNetworkOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_NETWORK_OFFERINGS, listNetworkOfferingsRequest, ListNetworkOfferingsResponse.class);
	}

	public ListHypervisorsResponse listHypervisors(ListHypervisorsRequest listHypervisorsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_HYPERVISORS, listHypervisorsRequest, ListHypervisorsResponse.class);
	}

	public ListDiskOfferingsResponse listDiskOfferings(ListDiskOfferingsRequest listDiskOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_DISK_OFFERINGS, listDiskOfferingsRequest, ListDiskOfferingsResponse.class);
	}

	public ListCapabilitiesResponse listCapabilities(ListCapabilitiesRequest listCapabilitiesRequest) throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_CAPABILITIES, listCapabilitiesRequest, ListCapabilitiesResponse.class);
	}

	public ListCapacityResponse listCapability(ListCapacityRequest listCapacityRequest)
			throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_CAPACITY, listCapacityRequest, ListCapacityResponse.class);
	}

	public ListHostsResponse listHosts(ListHostsRequest listHostsRequest)
			throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_HOSTS, listHostsRequest, ListHostsResponse.class);
	}

	public ListStoragePoolsResponse listStoragePools(ListStoragePoolsRequest listStoragePoolsRequest)
			throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_STORAGE_POOLS, listStoragePoolsRequest, ListStoragePoolsResponse.class);
	}

	public ListImageStoresResponse listImageStores(ListImageStoresRequest listImageStoresRequest)
			throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_IMAGE_STORES, listImageStoresRequest, ListImageStoresResponse.class);
	}

	public ListIsosResponse listIsos(ListIsosRequest listIsosRequest)
			throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_ISOS, listIsosRequest, ListIsosResponse.class);
	}

	public ListAffinityGroupsResponse listAffinityGroups(ListAffinityGroupsRequest listAffinityGroupsRequest)
			throws CloudStackClientException, CloudStackServiceException, IOException {
		return doRequest("GET", CloudStackAction.LIST_AFFINITY_GROUPS, listAffinityGroupsRequest, ListAffinityGroupsResponse.class);
	}
	
	//==================================================================================================
	private String sendRequest(String httpMethod, String action, Request request)
			throws CloudStackClientException, CloudStackServiceException, IOException {
		String urlStr = generateRequestUrl(action, request);
		InputStream content = null;
		HttpURLConnection connection = null;
		try {
			URL url = new URL(urlStr);

			if(DEBUG) System.out.println("url=" + url);
			
			connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			
			if(DEBUG) System.out.println("code=" + code);
			
			if (code >= 400) {
				content = connection.getErrorStream();
				String message = readContent(content);
				
				CloudStackServiceException exception = new CloudStackServiceException(
						message);
				exception.setServiceName(action);
				exception.setStatusCode(code);
				throw exception;
			} else {
				content = connection.getInputStream();
				String message = readContent(content);
				if(DEBUG) System.out.println("message=" + message);
				return message;
			}
		} catch (ConnectException e) {
			if("Connection refused".equals(e.getMessage())) {
				throw new CloudStackClientException("Authentication failed");
			}
			throw e;
		} catch (IOException e) {
			throw e;
		} finally {
			safeClose(content);
		}
	}
	
	private String generateRequestUrl(String action, Request request) throws CloudStackClientException {
		try {
            StringBuilder str = new StringBuilder();
            str.append(endpoint);

            // Make sure the url ends up exactly as http://x.x.x.x:y/client/api?command=
            // otherwise the server may choke like we've found it does for uploadSslCert command.
            while( str.lastIndexOf("/") == str.length()-1 ) {
                str.deleteCharAt(str.length()-1);
            }
            if( !str.toString().endsWith("/api") ) {
                str.append("/api");
            }
            str.append("?command=");
            str.append(action);
            str.append("&response=json");
            Map<String, String> params = request.toMap();
            if(params != null && params.size() > 0) {
            	Set<Entry<String, String>> paramEntries = params.entrySet();
            	for(Entry<String, String> paramEntry : paramEntries) {
            		str.append("&");
                    str.append(paramEntry.getKey());
                    if( paramEntry.getValue() != null ) {
                        str.append("=");
                        str.append(URLEncoder.encode(paramEntry.getValue(), "UTF-8").replaceAll("\\+", "%20"));
                    }
            	}
            }
            str.append("&apiKey=");
            str.append(URLEncoder.encode(apiKey, "UTF-8").replaceAll("\\+", "%20"));
            str.append("&signature=");
            try {
                str.append(URLEncoder.encode(getSignature(action, apiKey, secretKey, params), "UTF-8").replaceAll("\\+", "%20"));
            }
            catch( SignatureException e ) {
                throw new CloudStackClientException("签名错误!",e);
            }
            return str.toString();
        }
        catch( UnsupportedEncodingException e ) {
            e.printStackTrace();
            throw new RuntimeException("This cannot happen: " + e.getMessage());
        }
	}
	
	private String getSignature(String action, String apiKey, String secretKey, Map<String, String> params) throws UnsupportedEncodingException, SignatureException {
        try {
        	TreeMap<String, String> sorted = new TreeMap<String, String>();
            StringBuilder str = new StringBuilder();

            sorted.put("command", URLEncoder.encode(action, "UTF-8").replaceAll("\\+", "%20").toLowerCase());
            sorted.put("apikey", URLEncoder.encode(apiKey, "UTF-8").replaceAll("\\+", "%20").toLowerCase());
            sorted.put("response", URLEncoder.encode("json", "UTF-8"));
            if(params != null && params.size() > 0) {
            	Set<Entry<String, String>> paramEntries = params.entrySet();
            	for(Entry<String, String> paramEntry : paramEntries) {
            		sorted.put(paramEntry.getKey().toLowerCase(), URLEncoder.encode(paramEntry.getValue(), "UTF-8").replaceAll("\\+", "%20").toLowerCase());
            	}
            }
            boolean first = true;
            Set<Entry<String, String>> sortedEntries = sorted.entrySet();
            for(Entry<String, String> sortedEntry : sortedEntries) {
            	if( !first ) {
            		str.append("&");
            	}
            	first = false;
            	str.append(sortedEntry.getKey());
            	str.append("=");
            	str.append(sortedEntry.getValue());
            }
            return new String(Base64.encodeBase64(calculateHmac(str.toString(), secretKey)));
        }finally {
        }
    }
	
	private byte[] calculateHmac( String data, String key ) throws SignatureException {
        try {
            SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(ENCODING), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(signingKey);
            return mac.doFinal(data.getBytes(ENCODING));
        }
        catch( Exception e ) {
            throw new SignatureException("Failed to generate HMAC : " + e.getMessage());
        }
    }
	
	private String readContent(InputStream content) throws IOException {
		if (content == null)
			return "";

		Reader reader = null;
		Writer writer = new StringWriter();
		String result;

		char[] buffer = new char[1024];
		try {
			reader = new BufferedReader(
					new InputStreamReader(content, ENCODING));
			int n;
			while ((n = reader.read(buffer)) > 0) {
				writer.write(buffer, 0, n);
			}
			result = writer.toString();
		} finally {
			content.close();
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
		return result;
	}

	private void safeClose(InputStream inputStream) {
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException e) {
			}
		}
	}
	
	private <T> T doRequest(String httpMethod, String action, Request request, Class<T> T) throws CloudStackClientException, CloudStackServiceException, IOException {
		try {
			String jsonResponse = this.sendRequest(httpMethod, action, request);
			return new Gson().fromJson(jsonResponse, T);
		} catch (CloudStackClientException e) {
			throw e;
		} catch (CloudStackServiceException e) {
			throw e;
		}
	}
	
	private QueryAsyncJobResultResponse doRequest4AsyncJob(String httpMethod, String action, Request request) throws CloudStackClientException, CloudStackServiceException, IOException {
		QueryAsyncJobResultResponse resp = null;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action, request);
			JSONObject jObj = new JSONObject(jsonResponse);
			if(jObj != null) {
				if(jObj.has("queryasyncjobresultresponse")) {
					resp = new QueryAsyncJobResultResponse();
					JSONObject asyncJobResponseObj = jObj.getJSONObject("queryasyncjobresultresponse");
					String jobResultStr = null;
					if(asyncJobResponseObj.has("jobresult")) {
						JSONObject jobResultObj = asyncJobResponseObj.getJSONObject("jobresult");
						if(jobResultObj != null && jobResultObj.names() != null) {
							jobResultStr = jobResultObj.getJSONObject(jobResultObj.names().getString(0)).toString();
						}
						asyncJobResponseObj.remove("jobresult");
					}
					QueryAsyncJobResultResponseDetail jobDetail = new Gson().fromJson(asyncJobResponseObj.toString(), QueryAsyncJobResultResponseDetail.class);
					jobDetail.setJobresult(jobResultStr);
					resp.setQueryasyncjobresultresponse(jobDetail);
				}
			}
		} catch (CloudStackClientException e) {
			throw e;
		} catch (CloudStackServiceException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}
}
