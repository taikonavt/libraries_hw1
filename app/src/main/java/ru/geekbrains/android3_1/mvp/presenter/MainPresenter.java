package ru.geekbrains.android3_1.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import ru.geekbrains.android3_1.R;
import ru.geekbrains.android3_1.mvp.model.Model;
import ru.geekbrains.android3_1.mvp.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    Model model;

    public MainPresenter() {
        this.model = new Model();
    }

    public int calculateButtonValue(int index){
        model.setAt(index, model.getAt(index) + 1);
        return model.getAt(index);
    }

    public void onButtonOneClick() {
        getViewState().setButtonValue(0, calculateButtonValue(0));
    }

    public void onButtonTwoClick() {
        getViewState().setButtonValue(1, calculateButtonValue(1));
    }

    public void onButtonThreeClick() {
        getViewState().setButtonValue(2, calculateButtonValue(2));
    }
}
