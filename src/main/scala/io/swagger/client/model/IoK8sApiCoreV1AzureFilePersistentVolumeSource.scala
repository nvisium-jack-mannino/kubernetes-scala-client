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


case class IoK8sApiCoreV1AzureFilePersistentVolumeSource (
  /* Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. */
  readOnly: Option[Boolean],
  /* the name of secret that contains Azure Storage Account Name and Key */
  secretName: String,
  /* the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod */
  secretNamespace: Option[String],
  /* Share Name */
  shareName: String
)

