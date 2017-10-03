/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiExtensionsV1beta1FSGroupStrategyOptions (
  /* Ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. */
  ranges: Option[Seq[IoK8sApiExtensionsV1beta1IDRange]],
  /* Rule is the strategy that will dictate what FSGroup is used in the SecurityContext. */
  rule: Option[String]
) extends ApiModel


