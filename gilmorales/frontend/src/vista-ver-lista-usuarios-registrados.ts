import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-lista-usuarios-registrados')
export class VistaVerListaUsuariosRegistrados extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; position: fixed; overflow-y: auto; z-index: 1" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout style="width: 100%; justify-content: center;" id="layoutTitulo">
  <h1 style="flex-grow: 0; align-self: center; flex-shrink: 0; margin-top: 5%;" id="titulo">Lista de Usuarios Registrados</h1>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="align-self: flex-end; margin: var(--lumo-space-s); margin-right: 3%;" id="layoutBotonOrdenar"></vaadin-horizontal-layout>
 <hr style="width: 98%; align-self: center; height: 2px;">
 <vaadin-vertical-layout theme="spacing" id="layoutVerticalLista" style="flex-grow: 1; width: 100%; flex-shrink: 0; justify-content: flex-start; align-items: center;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
