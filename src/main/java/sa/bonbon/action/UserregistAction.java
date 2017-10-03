/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.form.UserregistForm;

public class UserregistAction {
	/**アクションフォーム*/
	@Resource
	@ActionForm
	protected UserregistForm userregistForm;

	/**入力画面の実行メソッド*/
    @Execute(validator = false)
	public String index() {
        return "user.jsp";
	}

//	/**遷移先の実行メソッド*/
//    @Execute(validator = false)
//	public String userRegist() {
//        return "hoge?redirect=true";
//	}
}
