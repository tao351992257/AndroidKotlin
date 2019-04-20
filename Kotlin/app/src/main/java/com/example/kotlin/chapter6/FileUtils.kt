package com.example.kotlin.chapter6

import android.os.Environment
import java.nio.file.Files.exists
import android.os.Environment.getExternalStorageDirectory
import java.io.File


/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/15
 */
class FileUtils {
    private val path = Environment.getExternalStorageDirectory().toString() + "/shidoe"

    constructor() {
        val file = File(path)
        /**
         * 如果文件夹不存在就创建
         */
        if (!file.exists()) {
            file.mkdirs()
        }
    }

    /**
     * 创建一个文件
     * @param FileName 文件名
     * @return
     */
    fun createFile(FileName: String): File {
        return File(path, FileName)
    }
}



