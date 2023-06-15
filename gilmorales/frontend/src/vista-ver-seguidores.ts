import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-ver-seguidores')
export class VistaVerSeguidores extends LitElement {
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
<vaadin-vertical-layout style="width: 60%; height: 80%; background-color: #ffffff; z-index: 999; margin-left: 20%; position: fixed; border-radius: 10px;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="" id="layoutTitulo" style="flex-shrink: 0; align-self: stretch; align-items: flex-start; justify-content: flex-start; background-color: #AED6F1;">
  <vaadin-button theme="icon" aria-label="Add new" id="botonCerrar" style="flex-shrink: 1; font-size: var(--lumo-icon-size-l); flex-grow: 0; height: 100%; align-self: center; background-color: transparent; border: none;">
   <iron-icon icon="lumo:cross" id="ironIcon"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout id="labelTitulo" style="flex-shrink: 0; flex-grow: 1; justify-content: center;">
   <h2 id="titulo" style="flex-shrink: 0; flex-grow: 0;">Seguidores</h2>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="layoutLista" style="align-self: center; width: 100%; flex-grow: 1; background-color: #FFFFFF; align-items: center; flex-shrink: 0; margin: var(--lumo-space-s);"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
