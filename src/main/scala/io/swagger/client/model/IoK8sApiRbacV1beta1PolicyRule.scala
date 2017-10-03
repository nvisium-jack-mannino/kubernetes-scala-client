/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class IoK8sApiRbacV1beta1PolicyRule (
  /* APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed. */
  apiGroups: Option[Seq[String]],
  /* NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \"pods\" or \"secrets\") or non-resource URL paths (such as \"/api\"),  but not both. */
  nonResourceURLs: Option[Seq[String]],
  /* ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed. */
  resourceNames: Option[Seq[String]],
  /* Resources is a list of resources this rule applies to.  ResourceAll represents all resources. */
  resources: Option[Seq[String]],
  /* Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds. */
  verbs: Seq[String]
) extends ApiModel


