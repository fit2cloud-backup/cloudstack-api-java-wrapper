package com.fit2cloud.cloudstack.wsclient.tools;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fit2cloud.cloudstack.wsclient.CloudStackWSClient;
import com.fit2cloud.cloudstack.wsclient.ICloudStackWSClient;
import com.fit2cloud.cloudstack.wsclient.constants.CapacityType;
import com.fit2cloud.cloudstack.wsclient.constants.TemplateFilterType;
import com.fit2cloud.cloudstack.wsclient.constants.VolumeType;
import com.fit2cloud.cloudstack.wsclient.domain.model.Template;
import com.fit2cloud.cloudstack.wsclient.domain.model.VirtualMachine;
import com.fit2cloud.cloudstack.wsclient.domain.model.Volume;
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
import com.fit2cloud.cloudstack.wsclient.model.request.volume.DeleteVolumeRequest;
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
import com.fit2cloud.cloudstack.wsclient.model.response.template.DeleteTemplateResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.template.ListTemplatesResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.DeployVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.DestroyVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.ListVirtualMachinesResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.RebootVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.StartVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine.StopVirtualMachineResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.volume.DeleteVolumeResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.volume.ListVolumesResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.vpc.ListVPCsResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.zone.ListZonesResponse;
import com.google.gson.Gson;

public class CloudStackAPITest {
	
	private static ICloudStackWSClient cloudStackWSClient;
	private static String endpoint;
	private static String apiKey;
	private static String secretKey;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream(new File("/opt/fit2cloud/cloudstack.credential")));
			endpoint = properties.getProperty("endpoint");
			apiKey = properties.getProperty("apikey");
			secretKey = properties.getProperty("secretkey");
			cloudStackWSClient = new CloudStackWSClient(apiKey, secretKey, endpoint);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//@Test
	public void test() throws Exception {
		String s = "{\"id\":\"9aab1416-2f83-4f8b-b295-aa961e51b6c3\",\"name\":\"f2c-centos6.8-template\",\"displaytext\":\"test\",\"ispublic\":true,\"created\":\"2016-09-06T18:36:22+0800\",\"isready\":true,\"passwordenabled\":true,\"format\":\"VHD\",\"isfeatured\":true,\"crossZones\":false,\"ostypeid\":\"ebcbed44-72e8-11e6-90df-000c2936bebb\",\"ostypename\":\"CentOS 6.4 (64-bit)\",\"account\":\"admin\",\"zoneid\":\"d7a6f2a7-995e-4b46-a7c3-52f916e10173\",\"zonename\":\"zone-1\",\"status\":\"Download Complete\",\"size\":10737418240,\"templatetype\":\"USER\",\"hypervisor\":\"XenServer\",\"domain\":\"ROOT\",\"domainid\":\"eb8b6418-72e8-11e6-90df-000c2936bebb\",\"isextractable\":false,\"sourcetemplateid\":\"99168342-4cf8-4c13-b266-2c8e6c1a265f\",\"details\":{\"platform\":\"viridian:true;acpi:1;apic:true;pae:true;nx:true\",\"Message.ReservedCapacityFreed.Flag\":\"false\"},\"tags\":[],\"sshkeyenabled\":false,\"isdynamicallyscalable\":true}";
		Template resp = new Gson().fromJson(s, Template.class);
		System.out.println(new Gson().toJson(resp));
	}
	//@Test
	public void testListRegions() throws Exception {
		ListRegionsRequest listRegionsRequest = new ListRegionsRequest();
		ListRegionsResponse resp = cloudStackWSClient.listRegions(listRegionsRequest);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListZones() throws Exception {
		ListZonesRequest listZonesRequest = new ListZonesRequest();
		ListZonesResponse resp = cloudStackWSClient.listZones(listZonesRequest);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListTemplates() throws Exception {
		ListTemplatesRequest req = new ListTemplatesRequest();
		req.setTemplatefilter(TemplateFilterType.ALL);
		req.setListall("true");
		req.setId("9aab1416-2f83-4f8b-b295-aa961e51b6c3");
		ListTemplatesResponse resp = cloudStackWSClient.listTemplates(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListIsos() throws Exception {
		ListIsosRequest req = new ListIsosRequest();
		req.setIsofilter(TemplateFilterType.ALL);
		ListIsosResponse resp = cloudStackWSClient.listIsos(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListVirtualMachines() throws Exception {
		ListVirtualMachinesRequest req = new ListVirtualMachinesRequest();
		req.setListall("true");
//		req.setId(id);
		ListVirtualMachinesResponse resp = cloudStackWSClient.listVirtualMachines(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListHypervisors() throws Exception {
		ListHypervisorsRequest req = new ListHypervisorsRequest();
		ListHypervisorsResponse resp = cloudStackWSClient.listHypervisors(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListServiceOfferings() throws Exception {
		ListServiceOfferingsRequest req = new ListServiceOfferingsRequest();
		ListServiceOfferingsResponse resp = cloudStackWSClient.listServiceOfferings(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListDiskOfferings() throws Exception {
		ListDiskOfferingsRequest req = new ListDiskOfferingsRequest();
		ListDiskOfferingsResponse resp = cloudStackWSClient.listDiskOfferings(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListVPCs() throws Exception {
		// TODO need test
		ListVPCsRequest req = new ListVPCsRequest();
		ListVPCsResponse resp = cloudStackWSClient.listVPCs(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListNetworks() throws Exception {
		ListNetworksRequest req = new ListNetworksRequest();
		ListNetworksResponse resp = cloudStackWSClient.listNetworks(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListNetworkOfferings() throws Exception {
		ListNetworkOfferingsRequest req = new ListNetworkOfferingsRequest();
		ListNetworkOfferingsResponse resp = cloudStackWSClient.listNetworkOfferings(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testQueryAsyncJobResult() throws Exception {
		QueryAsyncJobResultRequest req = new QueryAsyncJobResultRequest();
//		req.setJobid("b66da9d2-5854-4af1-96b1-856215878dca");
		req.setJobid("64e49a15-f8f5-48da-98cc-9bc826240548");
		QueryAsyncJobResultResponse resp = cloudStackWSClient.queryAsyncJobResult(req);
		System.out.println(new Gson().toJson(resp));
		String result = resp.getQueryasyncjobresultresponse().getJobresult();
		System.out.println("result :::::::: "+result);
		VirtualMachine vm = new Gson().fromJson(result, VirtualMachine.class);
		System.out.println("vm.name :: "+vm.getName());
		System.out.println("vm :: "+new Gson().toJson(vm));
	}
	
	//@Test
	public void testStopVirtualMachine() throws Exception {
		StopVirtualMachineRequest req = new StopVirtualMachineRequest();
		req.setForced("false");
		req.setId("0b2e6a31-eedc-45a1-b2aa-79c33cbc6862");
		StopVirtualMachineResponse resp = cloudStackWSClient.stopVirtualMachine(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testStartVirtualMachine() throws Exception {
		StartVirtualMachineRequest req = new StartVirtualMachineRequest();
		req.setId("0b2e6a31-eedc-45a1-b2aa-79c33cbc6862");
		StartVirtualMachineResponse resp = cloudStackWSClient.startVirtualMachine(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testRebootVirtualMachine() throws Exception {
		// TODO 似乎无用？返回成功，但stopped状态执行reboot仍是stopped，running状态执行后状态从未发生变化
		RebootVirtualMachineRequest req = new RebootVirtualMachineRequest();
		req.setId("0b2e6a31-eedc-45a1-b2aa-79c33cbc6862");
		RebootVirtualMachineResponse resp = cloudStackWSClient.rebootVirtualMachine(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testDestroyVirtualMachine() throws Exception {
		DestroyVirtualMachineRequest req = new DestroyVirtualMachineRequest();
		req.setId("661441fc-fb07-4e3c-96a0-c5ae392e716b");
		req.setExpunge("true");
		DestroyVirtualMachineResponse resp = cloudStackWSClient.destroyVirtualMachine(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testDeployVirtualMachine() throws Exception {
		DeployVirtualMachineRequest req = new DeployVirtualMachineRequest();
		req.setServiceofferingid("18bcf6b6-5e10-49b4-a6a2-ad9efd6e0af7");
		req.setZoneid("d7a6f2a7-995e-4b46-a7c3-52f916e10173");
		req.setTemplateid("99168342-4cf8-4c13-b266-2c8e6c1a265f");
		req.setHypervisor("XenServer");
		req.setDiskofferingid("c0c4f1bf-1c6c-42d3-b2f5-08e9a57d5006");
		req.setNetworkids("8e2ec95e-49ea-4834-a55e-338f9e10198e");
		DeployVirtualMachineResponse resp = cloudStackWSClient.deployVirtualMachine(req);
		System.out.println(new Gson().toJson(resp));
	}

	//@Test
	public void testListCapabilities() throws Exception {
		ListCapabilitiesRequest req = new ListCapabilitiesRequest();
		ListCapabilitiesResponse resp = cloudStackWSClient.listCapabilities(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListCapacity() throws Exception {
		ListCapacityRequest req = new ListCapacityRequest();
		req.setType(""+CapacityType.CAPACITY_TYPE_SECONDARY_STORAGE);
		ListCapacityResponse resp = cloudStackWSClient.listCapability(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testDeleteVolume() throws Exception {
		DeleteVolumeRequest req = new DeleteVolumeRequest();
		req.setId("e899915d-c98b-4202-868f-bab4eb37b89a");
		DeleteVolumeResponse resp = cloudStackWSClient.deleteVolume(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListHosts() throws Exception {
		ListHostsRequest req = new ListHostsRequest();
		ListHostsResponse resp = cloudStackWSClient.listHosts(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListStoragePools() throws Exception {
		ListStoragePoolsRequest req = new ListStoragePoolsRequest();
		ListStoragePoolsResponse resp = cloudStackWSClient.listStoragePools(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListImageStores() throws Exception {
		ListImageStoresRequest req = new ListImageStoresRequest();
		ListImageStoresResponse resp = cloudStackWSClient.listImageStores(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListAffinityGroups() throws Exception {
		ListAffinityGroupsRequest req = new ListAffinityGroupsRequest();
		ListAffinityGroupsResponse resp = cloudStackWSClient.listAffinityGroups(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testListVolumes() throws Exception {
		ListVolumesRequest req = new ListVolumesRequest();
		req.setListall("true");
		req.setVirtualmachineid("5abaf1b0-0984-45e5-9d51-22595d877ac6");
		req.setType(VolumeType.ROOT);
		ListVolumesResponse resp = cloudStackWSClient.listVolumes(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testDeleteTemplate() throws Exception {
		DeleteTemplateRequest req = new DeleteTemplateRequest();
		req.setId("3a3d8b7e-990e-4555-b42e-443b9d6c6671");
		DeleteTemplateResponse resp = cloudStackWSClient.deleteTemplate(req);
		System.out.println(new Gson().toJson(resp));
	}
	
	//@Test
	public void testCreateTemplate() throws Exception {
		ListVirtualMachinesRequest listVirtualMachinesRequest = new ListVirtualMachinesRequest();
		listVirtualMachinesRequest.setId("5abaf1b0-0984-45e5-9d51-22595d877ac6");
		listVirtualMachinesRequest.setListall("true");
		List<VirtualMachine> vms = cloudStackWSClient.listVirtualMachines(listVirtualMachinesRequest).getListvirtualmachinesresponse().getVirtualmachine();
		if(vms != null && vms.size() > 0) {
			VirtualMachine vm = vms.get(0);
			ListVolumesRequest req = new ListVolumesRequest();
			req.setListall("true");
			req.setVirtualmachineid(vm.getId());
			req.setType(VolumeType.ROOT);
			List<Volume> volumes = cloudStackWSClient.listVolumes(req).getListvolumesresponse().getVolume();
			if(volumes != null && volumes.size() > 0) {
				Volume volume = volumes.get(0);
				CreateTemplateRequest ctReq = new CreateTemplateRequest();
				ctReq.setVolumeid(volume.getId());
				ctReq.setName("testTT");
				ctReq.setDisplaytext("myTT");
				ctReq.setOstypeid(vm.getGuestosid());
				ctReq.setIspublic("false");
				ctReq.setIsfeatured("true");
				ctReq.setIsdynamicallyscalable("false");
				ctReq.setPasswordenabled("true");
				String jobId = cloudStackWSClient.createTemplate(ctReq).getCreatetemplateresponse().getJobid();
				QueryAsyncJobResultRequest queryAsyncJobResultRequest = new QueryAsyncJobResultRequest();
				queryAsyncJobResultRequest.setJobid(jobId);
				int count = 15;
				while(count-- > 0) {
					Thread.sleep(5000);
					QueryAsyncJobResultResponseDetail queryasyncjobresultresponse = cloudStackWSClient.queryAsyncJobResult(queryAsyncJobResultRequest).getQueryasyncjobresultresponse();
					int jobstatus = Integer.parseInt(queryasyncjobresultresponse.getJobstatus());
					System.out.println("job current status ::: "+jobstatus);
					if(jobstatus != 0) {
						if(jobstatus == 1) {
							String result = queryasyncjobresultresponse.getJobresult();
							Template template = new Gson().fromJson(result, Template.class);
							System.out.println("result :: "+result);
							System.out.println("template :: "+new Gson().toJson(template));
						}
						break;
					}
				}
			}
		}
		System.out.println("end");
	}
}
