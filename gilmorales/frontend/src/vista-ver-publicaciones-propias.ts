import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver-publicaciones-propias')
export class VistaVerPublicacionesPropias extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout" style="width: 100%; height: 100%; overflox-y: auto;"></vaadin-vertical-layout>
`;
  }


  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
