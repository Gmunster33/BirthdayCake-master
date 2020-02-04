package cs301.birthdaycake;

import cs301.birthdaycake.CakeView;

public class CakeController {
    private CakeView cakeView;
    private CakeModel cakeModel;

    private void makeCakeView(CakeView view) {
        cakeView = view;
        cakeModel = view.getCakeModel();
    }
}