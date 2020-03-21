import { UPDATE_CUSTOMER_FORM } from "../types";
const initialState = {};

export default function(state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case UPDATE_CUSTOMER_FORM:
      return { ...state, ...payload };

    default:
      return state;
  }
}
