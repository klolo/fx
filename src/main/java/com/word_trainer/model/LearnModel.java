package com.word_trainer.model;

import com.word_trainer.dto.Word;
import com.word_trainer.learn.LearnEntity;
import com.word_trainer.learn.LearnMode;
import com.word_trainer.services.WordsService;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class LearnModel {

    @Autowired
    protected WordsService wordsService;

    @FXML
    protected Label currentWord;

    @FXML
    protected ProgressBar learnProgress;

    @FXML
    protected RadioButton knowRadio;

    @FXML
    protected RadioButton notKnowRadio;

    @FXML
    protected RadioButton laterRadio;

    @FXML
    protected Label currentWordReverse;

    @Setter
    protected ObservableList<Word> wordsList;

    protected List<LearnEntity> learnList = new LinkedList<>();

    protected int WORDS_IN_LEARNING_SET = 5;

    protected int WORD_CORRECT_ANSWER_MIN = 2;

    protected static Random random = new Random();

    protected int wordIndex;

    @Getter
    protected int correct;

    @Getter
    protected int incorrect;

    protected double scoreLeft;

    @Setter
    protected LearnMode learnMode;

}
