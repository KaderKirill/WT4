package com.kader.lab4.controller.command.impl.transition;

import com.kader.lab4.controller.command.Command;
import com.kader.lab4.controller.command.CommandResult;
import com.kader.lab4.controller.command.CommandResultType;
import com.kader.lab4.controller.context.RequestContext;
import com.kader.lab4.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;

public class GoToLogInCommand implements Command {
    private static final String PAGE = "WEB-INF/view/login.jsp";

    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createContext();

        helper.updateRequest(requestContext);
        return new CommandResult(PAGE, CommandResultType.FORWARD);
    }
}