/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class IoK8sApiCoreV1NodeStatus (
  /* List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses */
  addresses: Option[List[IoK8sApiCoreV1NodeAddress]],
  /* Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. */
  allocatable: Option[Map[String, IoK8sApimachineryPkgApiResourceQuantity]],
  /* Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
  capacity: Option[Map[String, IoK8sApimachineryPkgApiResourceQuantity]],
  /* Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition */
  conditions: Option[List[IoK8sApiCoreV1NodeCondition]],
  /* Endpoints of daemons running on the Node. */
  daemonEndpoints: Option[IoK8sApiCoreV1NodeDaemonEndpoints],
  /* List of container images on this node */
  images: Option[List[IoK8sApiCoreV1ContainerImage]],
  /* Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info */
  nodeInfo: Option[IoK8sApiCoreV1NodeSystemInfo],
  /* NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated. */
  phase: Option[String],
  /* List of volumes that are attached to the node. */
  volumesAttached: Option[List[IoK8sApiCoreV1AttachedVolume]],
  /* List of attachable volumes in use (mounted) by the node. */
  volumesInUse: Option[List[String]]
)
