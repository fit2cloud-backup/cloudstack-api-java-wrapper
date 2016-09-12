package com.fit2cloud.cloudstack.wsclient;

import java.io.IOException;

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


public interface ICloudStackWSClient {

	//------------------------------Virtual Machine-------------------------------
	public DeployVirtualMachineResponse deployVirtualMachine(DeployVirtualMachineRequest deployVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public DestroyVirtualMachineResponse destroyVirtualMachine(DestroyVirtualMachineRequest destroyVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public RebootVirtualMachineResponse rebootVirtualMachine(RebootVirtualMachineRequest rebootVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public StartVirtualMachineResponse startVirtualMachine(StartVirtualMachineRequest startVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public StopVirtualMachineResponse stopVirtualMachine(StopVirtualMachineRequest stopVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ResetPasswordForVirtualMachineResponse resetPasswordForVirtualMachine(ResetPasswordForVirtualMachineRequest resetPasswordForVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public UpdateVirtualMachineResponse updateVirtualMachine(UpdateVirtualMachineRequest updateVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public ListVirtualMachinesResponse listVirtualMachines(ListVirtualMachinesRequest listVirtualMachinesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public GetVMPasswordResponse getVMPassword(GetVMPasswordRequest getVMPasswordRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public RestoreVirtualMachineResponse restoreVirtualMachine(RestoreVirtualMachineRequest restoreVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ChangeServiceForVirtualMachineResponse changeServiceForVirtualMachine(ChangeServiceForVirtualMachineRequest changeServiceForVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ScaleVirtualMachineResponse scaleVirtualMachine(ScaleVirtualMachineRequest scaleVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public AddNicToVirtualMachineResponse addNicToVirtualMachine(AddNicToVirtualMachineRequest addNicToVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public RemoveNicFromVirtualMachineResponse removeNicFromVirtualMachine(RemoveNicFromVirtualMachineRequest removeNicFromVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public UpdateDefaultNicForVirtualMachineResponse updateDefaultNicForVirtualMachine(UpdateDefaultNicForVirtualMachineRequest updateDefaultNicForVirtualMachineRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------VPC-------------------------------
	public ListVPCsResponse listVPCs(ListVPCsRequest listVPCsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public UpdateVPCResponse updateVPC(UpdateVPCRequest updateVPCRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ListVPCOfferingsResponse listVPCOfferings(ListVPCOfferingsRequest listVPCOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ListPrivateGatewaysResponse listPrivateGateways(ListPrivateGatewaysRequest listPrivateGatewaysRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Snapshot-------------------------------
//	public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest createSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest listSnapshotsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public CreateSnapshotPolicyResponse createSnapshotPolicy(CreateSnapshotPolicyRequest createSnapshotPolicyRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DeleteSnapshotPoliciesResponse deleteSnapshotPolicies(DeleteSnapshotPoliciesRequest deleteSnapshotPoliciesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ListSnapshotPoliciesResponse listSnapshotPolicies(ListSnapshotPoliciesRequest listSnapshotPoliciesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ListVMSnapshotResponse listVMSnapshot(ListVMSnapshotRequest listVMSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public CreateVMSnapshotResponse createVMSnapshot(CreateVMSnapshotRequest createVMSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DeleteVMSnapshotResponse deleteVMSnapshot(DeleteVMSnapshotRequest deleteVMSnapshotRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Volume-------------------------------
//	public AttachVolumeResponse attachVolume(AttachVolumeRequest attachVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public UploadVolumeResponse uploadVolume(UploadVolumeRequest uploadVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DetachVolumeResponse detachVolume(DetachVolumeRequest detachVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public CreateVolumeResponse createVolume(CreateVolumeRequest createVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest deleteVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public ListVolumesResponse listVolumes(ListVolumesRequest listVolumesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ExtractVolumeResponse extractVolume(ExtractVolumeRequest extractVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public MigrateVolumeResponse migrateVolume(MigrateVolumeRequest migrateVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest resizeVolumeRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Template-------------------------------
	public CreateTemplateResponse createTemplate(CreateTemplateRequest createTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public RegisterTemplateResponse registerTemplate(RegisterTemplateRequest registerTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest updateTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public CopyTemplateResponse copyTemplate(CopyTemplateRequest copyTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest deleteTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	public ListTemplatesResponse listTemplates(ListTemplatesRequest listTemplatesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public UpdateTemplatePermissionsResponse updateTemplatePermissions(UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ListTemplatePermissionsResponse listTemplatePermissions(ListTemplatePermissionsRequest listTemplatePermissionsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ExtractTemplateResponse extractTemplate(ExtractTemplateRequest extractTemplateRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------SSH-------------------------------
//	public RegisterSSHKeyPairResponse registerSSHKeyPair(RegisterSSHKeyPairRequest registerSSHKeyPairRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public CreateSSHKeyPairResponse createSSHKeyPair(CreateSSHKeyPairRequest createSSHKeyPairRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DeleteSSHKeyPairResponse deleteSSHKeyPair(DeleteSSHKeyPairRequest deleteSSHKeyPairRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ListSSHKeyPairsResponse listSSHKeyPairs(ListSSHKeyPairsRequest listSSHKeyPairsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Network-------------------------------
	public ListNetworksResponse listNetworks(ListNetworksRequest listNetworksRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Account-------------------------------
//	public ListAccountsResponse listAccounts(ListAccountsRequest listAccountsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public AddAccountToProjectResponse addAccountToProject(AddAccountToProjectRequest addAccountToProjectRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DeleteAccountFromProjectResponse deleteAccountFromProject(DeleteAccountFromProjectRequest deleteAccountFromProjectRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ListProjectAccountsResponse listProjectAccounts(ListProjectAccountsRequest listProjectAccountsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Resource tags-------------------------------
//	public CreateTagsResponse createTags(CreateTagsRequest createTagsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DeleteTagsResponse deleteTags(DeleteTagsRequest deleteTagsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ListTagsResponse listTags(ListTagsRequest listTagsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Address-------------------------------
//	public AssociateIpAddressResponse associateIpAddress(AssociateIpAddressRequest associateIpAddressRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public DisassociateIpAddressResponse disassociateIpAddress(DisassociateIpAddressRequest disassociateIpAddressRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public ListPublicIpAddressesResponse listPublicIpAddresses(ListPublicIpAddressesRequest listPublicIpAddressesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------User-------------------------------
//	public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public RegisterUserKeysResponse registerUserKeys(RegisterUserKeysRequest registerUserKeysRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Limit-------------------------------
//	public ListResourceLimitsResponse listResourceLimits(ListResourceLimitsRequest listResourceLimitsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
//
//	public GetApiLimitResponse getApiLimit(GetApiLimitRequest getApiLimitRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Guest OS-------------------------------
//	public ListOsTypesResponse listOsTypes(ListOsTypesRequest listOsTypesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ListOsCategoriesResponse listOsCategories(ListOsCategoriesRequest listOsCategoriesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Async job-------------------------------
	public QueryAsyncJobResultResponse queryAsyncJobResult(QueryAsyncJobResultRequest queryAsyncJobResultRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

//	public ListAsyncJobsResponse listAsyncJobs(ListAsyncJobsRequest listAsyncJobsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Zone-------------------------------
	public ListZonesResponse listZones(ListZonesRequest listZonesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Service Offering-------------------------------
	public ListServiceOfferingsResponse listServiceOfferings(ListServiceOfferingsRequest listServiceOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Region-------------------------------
	public ListRegionsResponse listRegions(ListRegionsRequest listRegionsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Network Offering-------------------------------
	public ListNetworkOfferingsResponse listNetworkOfferings(ListNetworkOfferingsRequest listNetworkOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Hypervisor-------------------------------
	public ListHypervisorsResponse listHypervisors(ListHypervisorsRequest listHypervisorsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Disk Offering-------------------------------
	public ListDiskOfferingsResponse listDiskOfferings(ListDiskOfferingsRequest listDiskOfferingsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

	//------------------------------Configuration-------------------------------
	public ListCapabilitiesResponse listCapabilities(ListCapabilitiesRequest listCapabilitiesRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
	
	//------------------------------System Capacity-------------------------------
	public ListCapacityResponse listCapability(ListCapacityRequest listCapacityRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
	
	//------------------------------Host-------------------------------
	public ListHostsResponse listHosts(ListHostsRequest listHostsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
	
	//------------------------------Storage Pools-------------------------------
	public ListStoragePoolsResponse listStoragePools(ListStoragePoolsRequest listStoragePoolsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
	
	//------------------------------Image Store-------------------------------
	public ListImageStoresResponse listImageStores(ListImageStoresRequest listImageStoresRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
	
	//------------------------------Iso-------------------------------
	public ListIsosResponse listIsos(ListIsosRequest listIsosRequest) throws CloudStackClientException, CloudStackServiceException, IOException;
	
	//------------------------------Affinity Groups-------------------------------
	public ListAffinityGroupsResponse listAffinityGroups(ListAffinityGroupsRequest listAffinityGroupsRequest) throws CloudStackClientException, CloudStackServiceException, IOException;

}
