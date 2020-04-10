import { GET_CUSTOMER_INFO, CLEAR_CUSTOMER_INFO } from "../types";

const initialState = {};

export default function (state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_CUSTOMER_INFO:
      return {
        ...state,
        ...payload,
      };
    case CLEAR_CUSTOMER_INFO:
      return {};

    default:
      return state;
  }
}
