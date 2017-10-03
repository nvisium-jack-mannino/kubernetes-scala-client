/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiCoreV1Taint (
  /* Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute. */
  effect: String,
  /* Required. The taint key to be applied to a node. */
  key: String,
  /* TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints. */
  timeAdded: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* Required. The taint value corresponding to the taint key. */
  value: Option[String]
) extends ApiModel


