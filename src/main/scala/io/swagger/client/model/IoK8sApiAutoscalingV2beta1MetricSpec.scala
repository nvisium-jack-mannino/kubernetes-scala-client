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


case class IoK8sApiAutoscalingV2beta1MetricSpec (
  /* object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object). */
  _object: Option[IoK8sApiAutoscalingV2beta1ObjectMetricSource],
  /* pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value. */
  pods: Option[IoK8sApiAutoscalingV2beta1PodsMetricSource],
  /* resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source. */
  resource: Option[IoK8sApiAutoscalingV2beta1ResourceMetricSource],
  /* type is the type of metric source.  It should match one of the fields below. */
  _type: String
)

