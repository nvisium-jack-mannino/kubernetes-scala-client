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


case class IoK8sApiCoreV1Handler (
  /* One and only one of the following should be specified. Exec specifies the action to take. */
  exec: Option[IoK8sApiCoreV1ExecAction],
  /* HTTPGet specifies the http request to perform. */
  httpGet: Option[IoK8sApiCoreV1HTTPGetAction],
  /* TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  tcpSocket: Option[IoK8sApiCoreV1TCPSocketAction]
)

