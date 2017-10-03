/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiExtensionsV1beta1ReplicaSetCondition (
  /* The last time the condition transitioned from one status to another. */
  lastTransitionTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* A human readable message indicating details about the transition. */
  message: Option[String],
  /* The reason for the condition's last transition. */
  reason: Option[String],
  /* Status of the condition, one of True, False, Unknown. */
  status: String,
  /* Type of replica set condition. */
  `type`: String
) extends ApiModel


