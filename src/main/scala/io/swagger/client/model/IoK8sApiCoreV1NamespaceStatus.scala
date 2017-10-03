/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiCoreV1NamespaceStatus (
  /* Phase is the current lifecycle phase of the namespace. More info: https://git.k8s.io/community/contributors/design-proposals/namespaces.md#phases */
  phase: Option[String]
) extends ApiModel


