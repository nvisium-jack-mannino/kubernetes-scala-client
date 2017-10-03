/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiAdmissionregistrationV1alpha1ExternalAdmissionHook (
  /* ClientConfig defines how to communicate with the hook. Required */
  clientConfig: IoK8sApiAdmissionregistrationV1alpha1AdmissionHookClientConfig,
  /* FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore. */
  failurePolicy: Option[String],
  /* The name of the external admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required. */
  name: String,
  /* Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. */
  rules: Option[Seq[IoK8sApiAdmissionregistrationV1alpha1RuleWithOperations]]
) extends ApiModel


