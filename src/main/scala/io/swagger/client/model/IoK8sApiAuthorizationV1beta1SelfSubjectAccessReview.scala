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


case class IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview (
  /* APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources */
  apiVersion: Option[String],
  /* Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: Option[String],
  metadata: Option[IoK8sApimachineryPkgApisMetaV1ObjectMeta],
  /* Spec holds information about the request being evaluated.  user and groups must be empty */
  spec: IoK8sApiAuthorizationV1beta1SelfSubjectAccessReviewSpec,
  /* Status is filled in by the server and indicates whether the request is allowed or not */
  status: Option[IoK8sApiAuthorizationV1beta1SubjectAccessReviewStatus]
)

