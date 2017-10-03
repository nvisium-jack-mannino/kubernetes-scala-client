/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiAppsV1beta2DeploymentSpec (
  /* Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  minReadySeconds: Option[Int],
  /* Indicates that the deployment is paused. */
  paused: Option[Boolean],
  /* The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s. */
  progressDeadlineSeconds: Option[Int],
  /* Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. */
  replicas: Option[Int],
  /* The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10. */
  revisionHistoryLimit: Option[Int],
  /* Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. */
  selector: Option[IoK8sApimachineryPkgApisMetaV1LabelSelector],
  /* The deployment strategy to use to replace existing pods with new ones. */
  strategy: Option[IoK8sApiAppsV1beta2DeploymentStrategy],
  /* Template describes the pods that will be created. */
  template: IoK8sApiCoreV1PodTemplateSpec
) extends ApiModel


