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


case class IoK8sApimachineryPkgApisMetaV1Status (
  /* APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources */
  apiVersion: Option[String],
  /* Suggested HTTP return code for this status, 0 if not set. */
  code: Option[Integer],
  /* Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type. */
  details: Option[IoK8sApimachineryPkgApisMetaV1StatusDetails],
  /* Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: Option[String],
  /* A human-readable description of the status of this operation. */
  message: Option[String],
  /* Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  metadata: Option[IoK8sApimachineryPkgApisMetaV1ListMeta],
  /* A machine-readable description of why this operation is in the \"Failure\" status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it. */
  reason: Option[String],
  /* Status of the operation. One of: \"Success\" or \"Failure\". More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status */
  status: Option[String]
)

