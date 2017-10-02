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


case class IoK8sApiAuthorizationV1beta1ResourceRule (
  /* APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  \"*\" means all. */
  apiGroups: Option[List[String]],
  /* ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  \"*\" means all. */
  resourceNames: Option[List[String]],
  /* Resources is a list of resources this rule applies to.  ResourceAll represents all resources.  \"*\" means all. */
  resources: Option[List[String]],
  /* Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  \"*\" means all. */
  verbs: List[String]
)

