package com.ojay.judgeservice.judge;

import com.ojay.judgeservice.judge.strategy.DefaultJudgeStrategy;
import com.ojay.judgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.ojay.judgeservice.judge.strategy.JudgeContext;
import com.ojay.judgeservice.judge.strategy.JudgeStrategy;
import com.ojay.model.codesandbox.JudgeInfo;
import com.ojay.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
