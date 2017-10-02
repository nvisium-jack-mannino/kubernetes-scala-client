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


case class IoK8sApiCoreV1ResourceQuotaStatus (
  /* Hard is the set of enforced hard limits for each named resource. More info: https://git.k8s.io/community/contributors/design-proposals/admission_control_resource_quota.md */
  hard: Option[Map[String, IoK8sApimachineryPkgApiResourceQuantity]],
  /* Used is the current observed total usage of the resource in the namespace. */
  used: Option[Map[String, IoK8sApimachineryPkgApiResourceQuantity]]
)
