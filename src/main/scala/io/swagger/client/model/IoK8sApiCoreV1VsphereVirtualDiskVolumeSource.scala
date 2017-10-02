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


case class IoK8sApiCoreV1VsphereVirtualDiskVolumeSource (
  /* Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. */
  fsType: Option[String],
  /* Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName. */
  storagePolicyID: Option[String],
  /* Storage Policy Based Management (SPBM) profile name. */
  storagePolicyName: Option[String],
  /* Path that identifies vSphere volume vmdk */
  volumePath: String
)

