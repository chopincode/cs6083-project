import axios from "axios";
import { LOGIN_EMPLOYEE, LOGOUT_EMPLOYEE } from "../types";

export const loginEmployee = (loginFormData) => async (dispatch) => {
  const config = {
    headers: {
      "Content-Type": "application/json",
    },
  };
  const body = JSON.stringify(loginFormData);

  try {
    const res = await axios.post(
      "http://localhost:8080/api/employee",
      body,
      config
    );

    dispatch({
      type: LOGIN_EMPLOYEE,
      payload: res.data,
    });
  } catch (err) {
    console.log(err.response.data.errors);
  }
};

export const logoutEmployee = () => async (dispatch) => {
  dispatch({
    type: LOGOUT_EMPLOYEE,
  });
};
