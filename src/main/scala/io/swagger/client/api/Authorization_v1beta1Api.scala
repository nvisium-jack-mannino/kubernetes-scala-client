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

package io.swagger.client.api

import io.swagger.client.model.IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview
import io.swagger.client.model.IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview
import io.swagger.client.model.IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview
import io.swagger.client.model.IoK8sApiAuthorizationV1beta1SubjectAccessReview
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1APIResourceList
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class Authorization_v1beta1Api(val defBasePath: String = "https://localhost",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * 
   * create a LocalSubjectAccessReview
   * @param namespace object name and auth scope, such as for teams and projects 
   * @param body  
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview
   */
  def createAuthorizationV1beta1NamespacedLocalSubjectAccessReview(namespace: String, body: IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview, pretty: Option[String] = None): Option[IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview] = {
    // create path and map variables
    val path = "/apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "namespace" + "\\}",apiInvoker.escape(namespace))

    val contentTypes = List("*/*")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (namespace == null) throw new Exception("Missing required parameter 'namespace' when calling Authorization_v1beta1Api->createAuthorizationV1beta1NamespacedLocalSubjectAccessReview")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling Authorization_v1beta1Api->createAuthorizationV1beta1NamespacedLocalSubjectAccessReview")

    pretty.map(paramVal => queryParams += "pretty" -> paramVal.toString)
    

    var postBody: AnyRef = body

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview]).asInstanceOf[IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * 
   * create a SelfSubjectAccessReview
   * @param body  
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview
   */
  def createAuthorizationV1beta1SelfSubjectAccessReview(body: IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview, pretty: Option[String] = None): Option[IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview] = {
    // create path and map variables
    val path = "/apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews".replaceAll("\\{format\\}", "json")

    val contentTypes = List("*/*")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling Authorization_v1beta1Api->createAuthorizationV1beta1SelfSubjectAccessReview")

    pretty.map(paramVal => queryParams += "pretty" -> paramVal.toString)
    

    var postBody: AnyRef = body

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview]).asInstanceOf[IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * 
   * create a SelfSubjectRulesReview
   * @param body  
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview
   */
  def createAuthorizationV1beta1SelfSubjectRulesReview(body: IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview, pretty: Option[String] = None): Option[IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview] = {
    // create path and map variables
    val path = "/apis/authorization.k8s.io/v1beta1/selfsubjectrulesreviews".replaceAll("\\{format\\}", "json")

    val contentTypes = List("*/*")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling Authorization_v1beta1Api->createAuthorizationV1beta1SelfSubjectRulesReview")

    pretty.map(paramVal => queryParams += "pretty" -> paramVal.toString)
    

    var postBody: AnyRef = body

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview]).asInstanceOf[IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * 
   * create a SubjectAccessReview
   * @param body  
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return IoK8sApiAuthorizationV1beta1SubjectAccessReview
   */
  def createAuthorizationV1beta1SubjectAccessReview(body: IoK8sApiAuthorizationV1beta1SubjectAccessReview, pretty: Option[String] = None): Option[IoK8sApiAuthorizationV1beta1SubjectAccessReview] = {
    // create path and map variables
    val path = "/apis/authorization.k8s.io/v1beta1/subjectaccessreviews".replaceAll("\\{format\\}", "json")

    val contentTypes = List("*/*")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling Authorization_v1beta1Api->createAuthorizationV1beta1SubjectAccessReview")

    pretty.map(paramVal => queryParams += "pretty" -> paramVal.toString)
    

    var postBody: AnyRef = body

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[IoK8sApiAuthorizationV1beta1SubjectAccessReview]).asInstanceOf[IoK8sApiAuthorizationV1beta1SubjectAccessReview])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * 
   * get available resources
   * @return IoK8sApimachineryPkgApisMetaV1APIResourceList
   */
  def getAuthorizationV1beta1APIResources(): Option[IoK8sApimachineryPkgApisMetaV1APIResourceList] = {
    // create path and map variables
    val path = "/apis/authorization.k8s.io/v1beta1/".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json", "application/yaml", "application/vnd.kubernetes.protobuf")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[IoK8sApimachineryPkgApisMetaV1APIResourceList]).asInstanceOf[IoK8sApimachineryPkgApisMetaV1APIResourceList])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
