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


case class IoK8sApiStorageV1StorageClass (
  /* AllowVolumeExpansion shows whether the storage class allow volume expand */
  allowVolumeExpansion: Option[Boolean],
  /* APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources */
  apiVersion: Option[String],
  /* Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: Option[String],
  /* Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata */
  metadata: Option[IoK8sApimachineryPkgApisMetaV1ObjectMeta],
  /* Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. [\"ro\", \"soft\"]. Not validated - mount of the PVs will simply fail if one is invalid. */
  mountOptions: Option[List[String]],
  /* Parameters holds the parameters for the provisioner that should create volumes of this storage class. */
  parameters: Option[Map[String, String]],
  /* Provisioner indicates the type of the provisioner. */
  provisioner: String,
  /* Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete. */
  reclaimPolicy: Option[String]
)
