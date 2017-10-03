/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiCoreV1PersistentVolumeStatus (
  /* A human-readable message indicating details about why the volume is in this state. */
  message: Option[String],
  /* Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase */
  phase: Option[String],
  /* Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI. */
  reason: Option[String]
) extends ApiModel


