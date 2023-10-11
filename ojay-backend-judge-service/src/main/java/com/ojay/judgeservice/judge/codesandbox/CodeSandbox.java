package com.ojay.judgeservice.judge.codesandbox;

import com.ojay.model.codesandbox.ExecuteCodeRequest;
import com.ojay.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
