package com.rubbertranslator.manager;

import com.rubbertranslator.modules.filter.ProcessFilter;
import com.rubbertranslator.modules.textpreprocessor.TextPreProcessor;
import com.rubbertranslator.modules.translate.Translator;
import com.rubbertranslator.modules.translate.baidu.BaiduTranslator;
import com.rubbertranslator.modules.translate.TranslatorEngine;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/5/8 10:00
 */
public class TranslatorFacade {

    // 进程过滤器
    private ProcessFilter processFilter;
    // 文本预处理器
    private TextPreProcessor textPreProcessor;
    // 翻译模块
    private Translator translator;

    public TranslatorFacade() {
        textPreProcessor = new TextPreProcessor();
        translator = new Translator();
    }

    public void setProcessFilter(@NotNull ProcessFilter processFilter) {
        this.processFilter = processFilter;
    }


    public void process(String text){
        if(text == null || "".equals(text)) return;

        String temp = text;
        String translated;
        // 做一个判断检验
        // do translate works
        if(processFilter.check()) return;
        temp = textPreProcessor.process(text);
        Logger.getLogger(this.getClass().getName()).log(Level.INFO,temp);
        translated = translator.translate("en","zh",temp);
        Logger.getLogger(this.getClass().getName()).log(Level.INFO,translated);
    }
}
