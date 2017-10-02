/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec (
  /* An eviction is allowed if at most \"maxUnavailable\" pods selected by \"selector\" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with \"minAvailable\". */
  maxUnavailable: Option[IoK8sApimachineryPkgUtilIntstrIntOrString],
  /* An eviction is allowed if at least \"minAvailable\" pods selected by \"selector\" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \"100%\". */
  minAvailable: Option[IoK8sApimachineryPkgUtilIntstrIntOrString],
  /* Label query over pods whose evictions are managed by the disruption budget. */
  selector: Option[IoK8sApimachineryPkgApisMetaV1LabelSelector]
)

