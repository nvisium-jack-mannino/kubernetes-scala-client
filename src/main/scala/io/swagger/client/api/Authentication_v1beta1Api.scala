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

import io.swagger.client.model.IoK8sApiAuthenticationV1beta1TokenReview
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1APIResourceList
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class Authentication_v1beta1Api(val defBasePath: String = "https://localhost",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * 
   * create a TokenReview
   * @param body  
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return IoK8sApiAuthenticationV1beta1TokenReview
   */
  def createAuthenticationV1beta1TokenReview(body: IoK8sApiAuthenticationV1beta1TokenReview, pretty: Option[String] = None): Option[IoK8sApiAuthenticationV1beta1TokenReview] = {
    // create path and map variables
    val path = "/apis/authentication.k8s.io/v1beta1/tokenreviews".replaceAll("\\{format\\}", "json")

    val contentTypes = List("*/*")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling Authentication_v1beta1Api->createAuthenticationV1beta1TokenReview")

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
           Some(apiInvoker.deserialize(s, "", classOf[IoK8sApiAuthenticationV1beta1TokenReview]).asInstanceOf[IoK8sApiAuthenticationV1beta1TokenReview])
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
  def getAuthenticationV1beta1APIResources(): Option[IoK8sApimachineryPkgApisMetaV1APIResourceList] = {
    // create path and map variables
    val path = "/apis/authentication.k8s.io/v1beta1/".replaceAll("\\{format\\}", "json")

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