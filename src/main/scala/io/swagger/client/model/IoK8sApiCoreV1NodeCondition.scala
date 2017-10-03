/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiCoreV1NodeCondition (
  /* Last time we got an update on a given condition. */
  lastHeartbeatTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* Last time the condition transit from one status to another. */
  lastTransitionTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* Human readable message indicating details about last transition. */
  message: Option[String],
  /* (brief) reason for the condition's last transition. */
  reason: Option[String],
  /* Status of the condition, one of True, False, Unknown. */
  status: String,
  /* Type of node condition. */
  `type`: String
) extends ApiModel


