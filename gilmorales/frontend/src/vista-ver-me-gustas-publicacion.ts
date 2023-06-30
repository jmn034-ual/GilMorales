import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-ver-me-gustas-publicacion')
export class VistaVerMeGustasPublicacion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutMeGustas">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="justify-content: flex-start; background-color: #AED6F1; align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="align-self: flex-start;">
   <vaadin-button theme="icon" aria-label="Add new" id="botonCerrar" style="flex-shrink: 1; font-size: var(--lumo-icon-size-l); flex-grow: 0; height: 100%; align-self: center; background-color: transparent; border: none;">
    <iron-icon icon="lumo:cross" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 1; flex-shrink: 0; align-self: center; justify-content: center;">
   <h2 id="titulo" style="align-self: center; margin-right: 10%;">Me Gustas</h2>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutLista" style="align-self: stretch; flex-grow: 1; align-items: center;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
