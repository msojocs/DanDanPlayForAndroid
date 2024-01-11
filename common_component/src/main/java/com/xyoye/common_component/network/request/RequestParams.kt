package com.xyoye.common_component.network.request

import com.xyoye.common_component.utils.JsonHelper
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody

// 定义请求集合别名
typealias RequestParams = HashMap<String, @JvmSuppressWildcards Any>

// 请求集合装换为Body
fun RequestParams.toRequestBody(mediaType: MediaType): RequestBody {
    return JsonHelper.toJson(this).orEmpty().toRequestBody(mediaType)
}