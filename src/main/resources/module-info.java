/**
 * @author Raven
 * date 2020/5/9 11:12
 * @version 1.0
 */
module rubbertranslator {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.logging;
    requires jna;
    requires jna.platform;
    requires java.desktop;
    requires jnativehook;
    requires com.google.gson;
    requires okhttp3;
    requires cglib;
    requires org.objectweb.asm;

    exports com.rubbertranslator;
    exports com.rubbertranslator.controller;
    exports com.rubbertranslator.modules;
    exports com.rubbertranslator.modules.filter;
    exports com.rubbertranslator.modules.history;
    exports com.rubbertranslator.modules.textprocessor.post;
    exports com.rubbertranslator.modules.textprocessor.pre;
    exports com.rubbertranslator.modules.translate;
    exports com.rubbertranslator.modules.translate.baidu;
    exports com.rubbertranslator.modules.translate.youdao;
    exports com.rubbertranslator.modules.translate.google;
    exports com.rubbertranslator.modules.textinput;
    exports com.rubbertranslator.modules.textinput.mousecopy;
    exports com.rubbertranslator.modules.textinput.clipboard;
    exports com.rubbertranslator.modules.textinput.ocr;
    exports com.rubbertranslator.modules.system;

    opens com.rubbertranslator.controller;
    opens com.rubbertranslator.modules.translate.baidu;
    opens com.rubbertranslator.modules.translate.youdao;
    opens com.rubbertranslator.modules.translate.google;
    opens com.rubbertranslator.modules.textinput.ocr;
    opens com.rubbertranslator.modules.system;
}