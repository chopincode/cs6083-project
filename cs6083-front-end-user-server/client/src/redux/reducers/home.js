import { GET_HOMES } from "../types";

const initialState = [];

export default function (state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_HOMES:
      return [...payload];

    default:
      return state;
  }
}
