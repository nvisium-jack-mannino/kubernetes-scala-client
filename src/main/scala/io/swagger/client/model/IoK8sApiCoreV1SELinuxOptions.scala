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


case class IoK8sApiCoreV1SELinuxOptions (
  /* Level is SELinux level label that applies to the container. */
  level: Option[String],
  /* Role is a SELinux role label that applies to the container. */
  role: Option[String],
  /* Type is a SELinux type label that applies to the container. */
  _type: Option[String],
  /* User is a SELinux user label that applies to the container. */
  user: Option[String]
)
