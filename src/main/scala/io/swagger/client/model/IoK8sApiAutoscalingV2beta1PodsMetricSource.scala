/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiAutoscalingV2beta1PodsMetricSource (
  /* metricName is the name of the metric in question */
  metricName: String,
  /* targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity) */
  targetAverageValue: IoK8sApimachineryPkgApiResourceQuantity
) extends ApiModel


