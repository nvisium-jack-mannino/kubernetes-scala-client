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


case class IoK8sApimachineryPkgApisMetaV1OwnerReference (
  /* API version of the referent. */
  apiVersion: String,
  /* If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. */
  blockOwnerDeletion: Option[Boolean],
  /* If true, this reference points to the managing controller. */
  controller: Option[Boolean],
  /* Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: String,
  /* Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names */
  name: String,
  /* UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids */
  uid: String
)
