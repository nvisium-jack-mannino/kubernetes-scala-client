/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiAppsV1beta1StatefulSet (
  /* APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources */
  apiVersion: Option[String],
  /* Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: Option[String],
  metadata: Option[IoK8sApimachineryPkgApisMetaV1ObjectMeta],
  /* Spec defines the desired identities of pods in this set. */
  spec: Option[IoK8sApiAppsV1beta1StatefulSetSpec],
  /* Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time. */
  status: Option[IoK8sApiAppsV1beta1StatefulSetStatus]
) extends ApiModel


