/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiCoreV1EndpointsList (
  /* APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources */
  apiVersion: Option[String],
  /* List of endpoints. */
  items: Seq[IoK8sApiCoreV1Endpoints],
  /* Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: Option[String],
  /* Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  metadata: Option[IoK8sApimachineryPkgApisMetaV1ListMeta]
) extends ApiModel


