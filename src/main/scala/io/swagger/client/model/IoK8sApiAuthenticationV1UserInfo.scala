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


case class IoK8sApiAuthenticationV1UserInfo (
  /* Any additional information provided by the authenticator. */
  extra: Option[Map[String, List[String]]],
  /* The names of groups this user is a part of. */
  groups: Option[List[String]],
  /* A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs. */
  uid: Option[String],
  /* The name that uniquely identifies this user among all active users. */
  username: Option[String]
)

