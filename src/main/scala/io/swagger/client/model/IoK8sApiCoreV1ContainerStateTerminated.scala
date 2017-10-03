/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiCoreV1ContainerStateTerminated (
  /* Container's ID in the format 'docker://<container_id>' */
  containerID: Option[String],
  /* Exit status from the last termination of the container */
  exitCode: Int,
  /* Time at which the container last terminated */
  finishedAt: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* Message regarding the last termination of the container */
  message: Option[String],
  /* (brief) reason from the last termination of the container */
  reason: Option[String],
  /* Signal from the last termination of the container */
  signal: Option[Int],
  /* Time at which previous execution of the container started */
  startedAt: Option[IoK8sApimachineryPkgApisMetaV1Time]
) extends ApiModel


