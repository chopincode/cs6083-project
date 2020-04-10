import { LOGIN_EMPLOYEE, LOGOUT_EMPLOYEE } from "../types";

const initialState = {
  employee: null,
  loading: true,
  error: {},
};

export default function (state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case LOGIN_EMPLOYEE:
      return {
        ...state,
        employee: payload,
        loading: false,
      };
    case LOGOUT_EMPLOYEE:
      return {
        ...state,
        employee: null,
        loading: false,
      };

    default:
      return state;
  }
}
