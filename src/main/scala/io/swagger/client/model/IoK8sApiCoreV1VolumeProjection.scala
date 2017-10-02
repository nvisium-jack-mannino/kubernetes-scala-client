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


case class IoK8sApiCoreV1VolumeProjection (
  /* information about the configMap data to project */
  configMap: Option[IoK8sApiCoreV1ConfigMapProjection],
  /* information about the downwardAPI data to project */
  downwardAPI: Option[IoK8sApiCoreV1DownwardAPIProjection],
  /* information about the secret data to project */
  secret: Option[IoK8sApiCoreV1SecretProjection]
)
