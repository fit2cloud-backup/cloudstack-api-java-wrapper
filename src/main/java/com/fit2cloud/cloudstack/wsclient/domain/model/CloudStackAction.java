package com.fit2cloud.cloudstack.wsclient.domain.model;

public class CloudStackAction {


	// Load Balancer
	public static final String CREATE_LOAD_BALANCER_RULE = "createLoadBalancerRule";
	public static final String DELETE_LOAD_BALANCER_RULE = "deleteLoadBalancerRule";
	public static final String REMOVE_FROM_LOAD_BALANCER_RULE = "removeFromLoadBalancerRule";
	public static final String ASSIGN_TO_LOAD_BALANCER_RULE = "assignToLoadBalancerRule";
	public static final String CREATE_LB_STICKINESS_POLICY = "createLBStickinessPolicy";
	public static final String DELETE_LB_STICKINESS_POLICY = "deleteLBStickinessPolicy";
	public static final String LIST_LOAD_BALANCER_RULES = "listLoadBalancerRules";
	public static final String LIST_LB_STICKINESS_POLICIES = "listLBStickinessPolicies";
	public static final String LIST_LB_HEALTH_CHECK_POLICIES = "listLBHealthCheckPolicies";
	public static final String CREATE_LB_HEALTH_CHECK_POLICY = "createLBHealthCheckPolicy";
	public static final String DELETE_LB_HEALTH_CHECK_POLICY = "deleteLBHealthCheckPolicy";
	public static final String LIST_LOAD_BALANCER_RULE_INSTANCES = "listLoadBalancerRuleInstances";
	public static final String UPDATE_LOAD_BALANCER_RULE = "updateLoadBalancerRule";
	public static final String CREATE_GLOBAL_LOAD_BALANCER_RULE = "createGlobalLoadBalancerRule";
	public static final String DELETE_GLOBAL_LOAD_BALANCER_RULE = "deleteGlobalLoadBalancerRule";
	public static final String UPDATE_GLOBAL_LOAD_BALANCER_RULE = "updateGlobalLoadBalancerRule";
	public static final String LIST_GLOBAL_LOAD_BALANCER_RULES = "listGlobalLoadBalancerRules";
	public static final String ASSIGN_TO_GLOBAL_LOAD_BALANCER_RULE = "assignToGlobalLoadBalancerRule";
	public static final String REMOVE_FROM_GLOBAL_LOAD_BALANCER_RULE = "removeFromGlobalLoadBalancerRule";
	public static final String CREATE_LOAD_BALANCER = "createLoadBalancer";
	public static final String LIST_LOAD_BALANCERS = "listLoadBalancers";
	public static final String DELETE_LOAD_BALANCER = "deleteLoadBalancer";

	// AutoScale
	public static final String CREATE_CONDITION = "createCondition";
	public static final String CREATE_AUTO_SCALE_POLICY = "createAutoScalePolicy";
	public static final String CREATE_AUTO_SCALE_VM_PROFILE = "createAutoScaleVmProfile";
	public static final String CREATE_AUTO_SCALE_VM_GROUP = "createAutoScaleVmGroup";
	public static final String DELETE_CONDITION = "deleteCondition";
	public static final String DELETE_AUTO_SCALE_POLICY = "deleteAutoScalePolicy";
	public static final String DELETE_AUTO_SCALE_VM_PROFILE = "deleteAutoScaleVmProfile";
	public static final String DELETE_AUTO_SCALE_VM_GROUP = "deleteAutoScaleVmGroup";
	public static final String LIST_COUNTERS = "listCounters";
	public static final String LIST_CONDITIONS = "listConditions";
	public static final String LIST_AUTO_SCALE_POLICIES = "listAutoScalePolicies";
	public static final String LIST_AUTO_SCALE_VM_PROFILES = "listAutoScaleVmProfiles";
	public static final String LIST_AUTO_SCALE_VM_GROUPS = "listAutoScaleVmGroups";
	public static final String ENABLE_AUTO_SCALE_VM_GROUP = "enableAutoScaleVmGroup";
	public static final String DISABLE_AUTO_SCALE_VM_GROUP = "disableAutoScaleVmGroup";
	public static final String UPDATE_AUTO_SCALE_POLICY = "updateAutoScalePolicy";
	public static final String UPDATE_AUTO_SCALE_VM_PROFILE = "updateAutoScaleVmProfile";
	public static final String UPDATE_AUTO_SCALE_VM_GROUP = "updateAutoScaleVmGroup";

	// VPN
	public static final String CREATE_REMOTE_ACCESS_VPN = "createRemoteAccessVpn";
	public static final String DELETE_REMOTE_ACCESS_VPN = "deleteRemoteAccessVpn";
	public static final String LIST_REMOTE_ACCESS_VPNS = "listRemoteAccessVpns";
	public static final String ADD_VPN_USER = "addVpnUser";
	public static final String REMOVE_VPN_USER = "removeVpnUser";
	public static final String LIST_VPN_USERS = "listVpnUsers";
	public static final String CREATE_VPN_CUSTOMER_GATEWAY = "createVpnCustomerGateway";
	public static final String CREATE_VPN_GATEWAY = "createVpnGateway";
	public static final String CREATE_VPN_CONNECTION = "createVpnConnection";
	public static final String DELETE_VPN_CUSTOMER_GATEWAY = "deleteVpnCustomerGateway";
	public static final String DELETE_VPN_GATEWAY = "deleteVpnGateway";
	public static final String DELETE_VPN_CONNECTION = "deleteVpnConnection";
	public static final String UPDATE_VPN_CUSTOMER_GATEWAY = "updateVpnCustomerGateway";
	public static final String RESET_VPN_CONNECTION = "resetVpnConnection";
	public static final String LIST_VPN_CUSTOMER_GATEWAYS = "listVpnCustomerGateways";
	public static final String LIST_VPN_GATEWAYS = "listVpnGateways";
	public static final String LIST_VPN_CONNECTIONS = "listVpnConnections";

	// Virtual Machine
	public static final String DEPLOY_VIRTUAL_MACHINE = "deployVirtualMachine";
	public static final String DESTROY_VIRTUAL_MACHINE = "destroyVirtualMachine";
	public static final String REBOOT_VIRTUAL_MACHINE = "rebootVirtualMachine";
	public static final String START_VIRTUAL_MACHINE = "startVirtualMachine";
	public static final String STOP_VIRTUAL_MACHINE = "stopVirtualMachine";
	public static final String RESET_PASSWORD_FOR_VIRTUAL_MACHINE = "resetPasswordForVirtualMachine";
	public static final String UPDATE_VIRTUAL_MACHINE = "updateVirtualMachine";
	public static final String LIST_VIRTUAL_MACHINES = "listVirtualMachines";
	public static final String GET_VM_PASSWORD = "getVMPassword";
	public static final String RESTORE_VIRTUAL_MACHINE = "restoreVirtualMachine";
	public static final String CHANGE_SERVICE_FOR_VIRTUAL_MACHINE = "changeServiceForVirtualMachine";
	public static final String SCALE_VIRTUAL_MACHINE = "scaleVirtualMachine";
	public static final String ADD_NIC_TO_VIRTUAL_MACHINE = "addNicToVirtualMachine";
	public static final String REMOVE_NIC_FROM_VIRTUAL_MACHINE = "removeNicFromVirtualMachine";
	public static final String UPDATE_DEFAULT_NIC_FOR_VIRTUAL_MACHINE = "updateDefaultNicForVirtualMachine";

	// VPC
	public static final String CREATE_VPC = "createVPC";
	public static final String LIST_VP_CS = "listVPCs";
	public static final String DELETE_VPC = "deleteVPC";
	public static final String UPDATE_VPC = "updateVPC";
	public static final String RESTART_VPC = "restartVPC";
	public static final String LIST_VPC_OFFERINGS = "listVPCOfferings";
	public static final String LIST_PRIVATE_GATEWAYS = "listPrivateGateways";
	public static final String CREATE_STATIC_ROUTE = "createStaticRoute";
	public static final String DELETE_STATIC_ROUTE = "deleteStaticRoute";
	public static final String LIST_STATIC_ROUTES = "listStaticRoutes";

	// Snapshot
	public static final String CREATE_SNAPSHOT = "createSnapshot";
	public static final String LIST_SNAPSHOTS = "listSnapshots";
	public static final String DELETE_SNAPSHOT = "deleteSnapshot";
	public static final String CREATE_SNAPSHOT_POLICY = "createSnapshotPolicy";
	public static final String DELETE_SNAPSHOT_POLICIES = "deleteSnapshotPolicies";
	public static final String LIST_SNAPSHOT_POLICIES = "listSnapshotPolicies";
	public static final String LIST_VM_SNAPSHOT = "listVMSnapshot";
	public static final String CREATE_VM_SNAPSHOT = "createVMSnapshot";
	public static final String DELETE_VM_SNAPSHOT = "deleteVMSnapshot";
	public static final String REVERT_TO_VM_SNAPSHOT = "revertToVMSnapshot";

	// ISO
	public static final String ATTACH_ISO = "attachIso";
	public static final String DETACH_ISO = "detachIso";
	public static final String LIST_ISOS = "listIsos";
	public static final String REGISTER_ISO = "registerIso";
	public static final String UPDATE_ISO = "updateIso";
	public static final String DELETE_ISO = "deleteIso";
	public static final String COPY_ISO = "copyIso";
	public static final String UPDATE_ISO_PERMISSIONS = "updateIsoPermissions";
	public static final String LIST_ISO_PERMISSIONS = "listIsoPermissions";
	public static final String EXTRACT_ISO = "extractIso";

	// Firewall
	public static final String LIST_PORT_FORWARDING_RULES = "listPortForwardingRules";
	public static final String CREATE_PORT_FORWARDING_RULE = "createPortForwardingRule";
	public static final String DELETE_PORT_FORWARDING_RULE = "deletePortForwardingRule";
	public static final String UPDATE_PORT_FORWARDING_RULE = "updatePortForwardingRule";
	public static final String CREATE_FIREWALL_RULE = "createFirewallRule";
	public static final String DELETE_FIREWALL_RULE = "deleteFirewallRule";
	public static final String LIST_FIREWALL_RULES = "listFirewallRules";
	public static final String CREATE_EGRESS_FIREWALL_RULE = "createEgressFirewallRule";
	public static final String DELETE_EGRESS_FIREWALL_RULE = "deleteEgressFirewallRule";
	public static final String LIST_EGRESS_FIREWALL_RULES = "listEgressFirewallRules";

	// Volume
	public static final String ATTACH_VOLUME = "attachVolume";
	public static final String UPLOAD_VOLUME = "uploadVolume";
	public static final String DETACH_VOLUME = "detachVolume";
	public static final String CREATE_VOLUME = "createVolume";
	public static final String DELETE_VOLUME = "deleteVolume";
	public static final String LIST_VOLUMES = "listVolumes";
	public static final String EXTRACT_VOLUME = "extractVolume";
	public static final String MIGRATE_VOLUME = "migrateVolume";
	public static final String RESIZE_VOLUME = "resizeVolume";

	// Template
	public static final String CREATE_TEMPLATE = "createTemplate";
	public static final String REGISTER_TEMPLATE = "registerTemplate";
	public static final String UPDATE_TEMPLATE = "updateTemplate";
	public static final String COPY_TEMPLATE = "copyTemplate";
	public static final String DELETE_TEMPLATE = "deleteTemplate";
	public static final String LIST_TEMPLATES = "listTemplates";
	public static final String UPDATE_TEMPLATE_PERMISSIONS = "updateTemplatePermissions";
	public static final String LIST_TEMPLATE_PERMISSIONS = "listTemplatePermissions";
	public static final String EXTRACT_TEMPLATE = "extractTemplate";

	// Project
	public static final String CREATE_PROJECT = "createProject";
	public static final String DELETE_PROJECT = "deleteProject";
	public static final String UPDATE_PROJECT = "updateProject";
	public static final String ACTIVATE_PROJECT = "activateProject";
	public static final String SUSPEND_PROJECT = "suspendProject";
	public static final String LIST_PROJECTS = "listProjects";
	public static final String LIST_PROJECT_INVITATIONS = "listProjectInvitations";
	public static final String UPDATE_PROJECT_INVITATION = "updateProjectInvitation";
	public static final String DELETE_PROJECT_INVITATION = "deleteProjectInvitation";

	// Network ACL
	public static final String CREATE_NETWORK_ACL = "createNetworkACL";
	public static final String UPDATE_NETWORK_ACL_ITEM = "updateNetworkACLItem";
	public static final String DELETE_NETWORK_ACL = "deleteNetworkACL";
	public static final String LIST_NETWORK_AC_LS = "listNetworkACLs";
	public static final String CREATE_NETWORK_ACL_LIST = "createNetworkACLList";
	public static final String DELETE_NETWORK_ACL_LIST = "deleteNetworkACLList";
	public static final String REPLACE_NETWORK_ACL_LIST = "replaceNetworkACLList";
	public static final String LIST_NETWORK_ACL_LISTS = "listNetworkACLLists";

	// Security Group
	public static final String CREATE_SECURITY_GROUP = "createSecurityGroup";
	public static final String DELETE_SECURITY_GROUP = "deleteSecurityGroup";
	public static final String AUTHORIZE_SECURITY_GROUP_INGRESS = "authorizeSecurityGroupIngress";
	public static final String REVOKE_SECURITY_GROUP_INGRESS = "revokeSecurityGroupIngress";
	public static final String AUTHORIZE_SECURITY_GROUP_EGRESS = "authorizeSecurityGroupEgress";
	public static final String REVOKE_SECURITY_GROUP_EGRESS = "revokeSecurityGroupEgress";
	public static final String LIST_SECURITY_GROUPS = "listSecurityGroups";

	// SSH
	public static final String RESET_SSH_KEY_FOR_VIRTUAL_MACHINE = "resetSSHKeyForVirtualMachine";
	public static final String REGISTER_SSH_KEY_PAIR = "registerSSHKeyPair";
	public static final String CREATE_SSH_KEY_PAIR = "createSSHKeyPair";
	public static final String DELETE_SSH_KEY_PAIR = "deleteSSHKeyPair";
	public static final String LIST_SSH_KEY_PAIRS = "listSSHKeyPairs";

	// Network
	public static final String CREATE_NETWORK = "createNetwork";
	public static final String DELETE_NETWORK = "deleteNetwork";
	public static final String LIST_NETWORKS = "listNetworks";
	public static final String RESTART_NETWORK = "restartNetwork";
	public static final String UPDATE_NETWORK = "updateNetwork";

	// NAT
	public static final String ENABLE_STATIC_NAT = "enableStaticNat";
	public static final String CREATE_IP_FORWARDING_RULE = "createIpForwardingRule";
	public static final String DELETE_IP_FORWARDING_RULE = "deleteIpForwardingRule";
	public static final String LIST_IP_FORWARDING_RULES = "listIpForwardingRules";
	public static final String DISABLE_STATIC_NAT = "disableStaticNat";

	// Affinity Group
	public static final String CREATE_AFFINITY_GROUP = "createAffinityGroup";
	public static final String DELETE_AFFINITY_GROUP = "deleteAffinityGroup";
	public static final String LIST_AFFINITY_GROUPS = "listAffinityGroups";
	public static final String UPDATE_VM_AFFINITY_GROUP = "updateVMAffinityGroup";
	public static final String LIST_AFFINITY_GROUP_TYPES = "listAffinityGroupTypes";

	// VM Group
	public static final String CREATE_INSTANCE_GROUP = "createInstanceGroup";
	public static final String DELETE_INSTANCE_GROUP = "deleteInstanceGroup";
	public static final String UPDATE_INSTANCE_GROUP = "updateInstanceGroup";
	public static final String LIST_INSTANCE_GROUPS = "listInstanceGroups";

	// Event
	public static final String LIST_EVENTS = "listEvents";
	public static final String LIST_EVENT_TYPES = "listEventTypes";
	public static final String ARCHIVE_EVENTS = "archiveEvents";
	public static final String DELETE_EVENTS = "deleteEvents";

	// Account
	public static final String LIST_ACCOUNTS = "listAccounts";
	public static final String ADD_ACCOUNT_TO_PROJECT = "addAccountToProject";
	public static final String DELETE_ACCOUNT_FROM_PROJECT = "deleteAccountFromProject";
	public static final String LIST_PROJECT_ACCOUNTS = "listProjectAccounts";

	// Resource tags
	public static final String CREATE_TAGS = "createTags";
	public static final String DELETE_TAGS = "deleteTags";
	public static final String LIST_TAGS = "listTags";

	// Nic
	public static final String ADD_IP_TO_NIC = "addIpToNic";
	public static final String REMOVE_IP_FROM_NIC = "removeIpFromNic";
	public static final String LIST_NICS = "listNics";

	// Address
	public static final String ASSOCIATE_IP_ADDRESS = "associateIpAddress";
	public static final String DISASSOCIATE_IP_ADDRESS = "disassociateIpAddress";
	public static final String LIST_PUBLIC_IP_ADDRESSES = "listPublicIpAddresses";

	// User
	public static final String UPDATE_USER = "updateUser";
	public static final String REGISTER_USER_KEYS = "registerUserKeys";

	// Limit
	public static final String LIST_RESOURCE_LIMITS = "listResourceLimits";
	public static final String GET_API_LIMIT = "getApiLimit";

	// Guest OS
	public static final String LIST_OS_TYPES = "listOsTypes";
	public static final String LIST_OS_CATEGORIES = "listOsCategories";

	// Async job
	public static final String QUERY_ASYNC_JOB_RESULT = "queryAsyncJobResult";
	public static final String LIST_ASYNC_JOBS = "listAsyncJobs";

	// Zone
	public static final String LIST_ZONES = "listZones";

	// Service Offering
	public static final String LIST_SERVICE_OFFERINGS = "listServiceOfferings";

	// Region
	public static final String LIST_REGIONS = "listRegions";

	// Network Offering
	public static final String LIST_NETWORK_OFFERINGS = "listNetworkOfferings";

	// Logout
	public static final String LOGOUT = "logout";

	// Login
	public static final String LOGIN = "login";

	// Hypervisor
	public static final String LIST_HYPERVISORS = "listHypervisors";

	// Disk Offering
	public static final String LIST_DISK_OFFERINGS = "listDiskOfferings";

	// Configuration
	public static final String LIST_CAPABILITIES = "listCapabilities";

	// Cloud Identifier
	public static final String GET_CLOUD_IDENTIFIER = "getCloudIdentifier";

	// API Discovery
	public static final String LIST_APIS = "listApis";
	
	// System Capacity
	public static final String LIST_CAPACITY = "listCapacity";

	// Host
	public static final String LIST_HOSTS = "listHosts";
	
	// Storage Pools
	public static final String LIST_STORAGE_POOLS = "listStoragePools";
	
	// Image Store
	public static final String LIST_IMAGE_STORES = "listImageStores";
	
}
