/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiCoreV1SecretEnvSource (
  /* Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
  name: Option[String],
  /* Specify whether the Secret must be defined */
  optional: Option[Boolean]
) extends ApiModel


