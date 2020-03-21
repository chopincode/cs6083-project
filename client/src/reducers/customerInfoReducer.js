import { GET_CUSTOMER_BY_ID } from "../types";
const initialState = {};

export default function(state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_CUSTOMER_BY_ID:
      return { ...state, ...payload };

    default:
      return state;
  }
}
